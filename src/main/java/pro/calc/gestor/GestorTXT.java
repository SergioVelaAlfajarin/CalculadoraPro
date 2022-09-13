package pro.calc.gestor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class GestorTXT {

    public static void crearfichero() {
        try {
            String ruta = "operaciones/historial.txt";
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void exportarFichero() throws FileNotFoundException, IOException {
        //Copiara el archivo en el escritorio
        File origen = new File("operaciones/historial.txt");
        File destino = new File("../historial.txt");

        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static void escribeOperacion(String resFormatted) {
        try {
            String ruta = "operaciones/historial.txt";
            //Para escribir            
            String contenido = resFormatted + "\n";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
