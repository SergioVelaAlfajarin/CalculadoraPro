package pro.calc.main;

import pro.calc.gestor.GestorBD;
import pro.calc.vistas.principales.VistaPrincipalMin;

public class Calculadora {

    public static void main(String[] args) {
        //Accedemos a la bbdd
        try {
            GestorBD.init("user", "1234", "operaciones", "jdbc:mysql://127.0.0.1:3306/");
        } catch (Exception ignored) {
        }

        int color = 0;
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
        new VistaPrincipalMin();
    }
}
