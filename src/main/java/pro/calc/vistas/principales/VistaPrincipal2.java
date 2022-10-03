/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.calc.vistas.principales;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sergi
 */
public class VistaPrincipal2 extends JFrame {

    public VistaPrincipal2(
            Dimension size,
            JPanel content,
            boolean undecorated
    ) {
        setSize(size);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Calculadora Pro");
        setIcon();
        setMenuBar();
        setUndecorated(undecorated);

        setVisible(true);
    }

    private void setIcon() {
        File f = new File("../resources/icon.png");
        if (!f.exists()) {
            f = new File("resources/icon.png");
        }
        if (!f.exists()) {
            return;
        }
        ImageIcon img = new ImageIcon(f.getAbsolutePath());
        setIconImage(img.getImage());
    }

    private void setMenuBar() {
        javax.swing.JMenuItem cilindroItem;
        javax.swing.JMenuItem circunferenciaItem;
        javax.swing.JMenuItem conversorItem;
        javax.swing.JMenuItem cuadradoItem;
        javax.swing.JMenuItem cuboItem;
        javax.swing.JMenuItem esferaItem;
        javax.swing.JMenuItem exportarItem;
        javax.swing.JMenuItem opcionesItem;
        javax.swing.JMenuItem opinionItem;
        javax.swing.JMenuItem salirItem;
        javax.swing.JMenuItem trianguloItem;
        javax.swing.JMenu volumenMenu;
        javax.swing.JMenuItem acercaDeItem;
        javax.swing.JMenu archivoMenu;
        javax.swing.JMenu areasMenu;
        javax.swing.JMenu avanzadosMenu;
        javax.swing.JMenu ayudaMenu;
        javax.swing.JMenuBar barraMenu;
        javax.swing.JMenuItem borrarHistorial;

        barraMenu = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        exportarItem = new javax.swing.JMenuItem();
        borrarHistorial = new javax.swing.JMenuItem();
        opcionesItem = new javax.swing.JMenuItem();
        salirItem = new javax.swing.JMenuItem();
        avanzadosMenu = new javax.swing.JMenu();
        areasMenu = new javax.swing.JMenu();
        cuadradoItem = new javax.swing.JMenuItem();
        trianguloItem = new javax.swing.JMenuItem();
        circunferenciaItem = new javax.swing.JMenuItem();
        volumenMenu = new javax.swing.JMenu();
        cuboItem = new javax.swing.JMenuItem();
        esferaItem = new javax.swing.JMenuItem();
        cilindroItem = new javax.swing.JMenuItem();
        conversorItem = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();
        acercaDeItem = new javax.swing.JMenuItem();
        opinionItem = new javax.swing.JMenuItem();

        archivoMenu.setText("Archivo");

        exportarItem.setText("Exportar txt");
        archivoMenu.add(exportarItem);

        borrarHistorial.setText("Borrar Historial");
        archivoMenu.add(borrarHistorial);

        opcionesItem.setText("Opciones...");
        archivoMenu.add(opcionesItem);

        salirItem.setText("Salir");
        archivoMenu.add(salirItem);

        barraMenu.add(archivoMenu);

        avanzadosMenu.setText("Calculos avanzados");

        areasMenu.setText("Areas");

        cuadradoItem.setText("Cuadrado");
        areasMenu.add(cuadradoItem);

        trianguloItem.setText("Triangulo");
        areasMenu.add(trianguloItem);

        circunferenciaItem.setText("Circunferencia");
        areasMenu.add(circunferenciaItem);

        avanzadosMenu.add(areasMenu);

        volumenMenu.setText("Volumen");

        cuboItem.setText("Cubo");
        volumenMenu.add(cuboItem);

        esferaItem.setText("Esfera");
        volumenMenu.add(esferaItem);

        cilindroItem.setText("Cilindro");
        volumenMenu.add(cilindroItem);

        avanzadosMenu.add(volumenMenu);

        conversorItem.setText("Conversor...");
        avanzadosMenu.add(conversorItem);

        barraMenu.add(avanzadosMenu);

        ayudaMenu.setText("Ayuda");

        acercaDeItem.setText("Acerca de...");
        ayudaMenu.add(acercaDeItem);

        opinionItem.setText("Danos tu opinión");
        ayudaMenu.add(opinionItem);

        barraMenu.add(ayudaMenu);

        setJMenuBar(barraMenu);
    }
}
