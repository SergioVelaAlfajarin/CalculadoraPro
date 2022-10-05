package pro.calc.main;

import pro.calc.exception.CalcException;
import pro.calc.gestor.GestorBD;
import pro.calc.vistas.principales.*;

public class Calculadora {

    private static VistaPrincipal vistaMin, vistaMax;

    public static void main(String[] args) {
        //Accedemos a la bbdd
        try {
            GestorBD.init("user", "1234", "operaciones", "jdbc:mysql://127.0.0.1:3306/");
        } catch (CalcException ignored) {
        }

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

        vistaMin = new VistaPrincipalMin();
        vistaMax = new VistaPrincipalMax();
        
        setVistaMin();
    }

    public static void setVistaMax() {
        vistaMin.setVisible(false);
        vistaMax.setVisible(true);
    }

    public static void setVistaMin() {
        vistaMin.setVisible(true);
        vistaMax.setVisible(false);
    }
}
