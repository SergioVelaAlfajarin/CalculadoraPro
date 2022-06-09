package pro.calc.main;

import java.net.URL;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import pro.calc.vistas.VistaPrincipal;

public class Calculadora {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Error xd");
        }
        var v = new VistaPrincipal();
    }
}
