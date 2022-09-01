package pro.calc.main;

import pro.calc.gestor.GestorTXT;
import pro.calc.gestor.GestorXAMP;
import pro.calc.vistas.VistaPrincipal;

public class Calculadora {

    public static void main(String[] args) {
        Conectar conn = conexion();
        GestorTXT.crearfichero();
        GestorXAMP.
        int color =0;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        var v = new VistaPrincipal(color);
    }
}
