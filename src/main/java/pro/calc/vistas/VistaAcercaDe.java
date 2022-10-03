package pro.calc.vistas;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import pro.calc.exception.CalcException;
import pro.calc.vistas.principales.VistaPrincipal;

public class VistaAcercaDe extends javax.swing.JFrame {

    private final VistaPrincipal v;

    public VistaAcercaDe(VistaPrincipal v, int c) {
        this.v = v;
        initComponents();
        setIconImage();
        setTitle("Acerca de...");
        setLocationRelativeTo(null);
        setVisible(true);
        cambiaColor(c);
    }

    private void cambiaColor(int c) {
        switch (c) {
            case 1 -> {
                getContentPane().setBackground(Color.RED);
                panelPrincipal.setBackground(Color.RED);
            }
            case 2 -> {
                getContentPane().setBackground(Color.GRAY);
                panelPrincipal.setBackground(Color.GRAY);
            }
            case 3 -> {
                getContentPane().setBackground(Color.WHITE);
                panelPrincipal.setBackground(Color.WHITE);
            }
            case 4 -> {
                getContentPane().setBackground(Color.GREEN);
                panelPrincipal.setBackground(Color.GREEN);
            }
            case 5 -> {
                getContentPane().setBackground(Color.YELLOW);
                panelPrincipal.setBackground(Color.YELLOW);
            }
            case 6 -> {
                getContentPane().setBackground(Color.BLUE);
                panelPrincipal.setBackground(Color.BLUE);
            }
        }
    }

    private void setIconImage() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        pregunta1Lbl = new javax.swing.JLabel();
        respuesta1Lbl = new javax.swing.JLabel();
        descripcion1Lbl = new javax.swing.JLabel();
        descripcion2Lbl = new javax.swing.JLabel();
        descripcion3Lbl = new javax.swing.JLabel();
        versionLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pregunta1Lbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        pregunta1Lbl.setText("¿Quiénes forman parte de este proyecto?");

        respuesta1Lbl.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        respuesta1Lbl.setText("Somos Pablo Gonzálvez y Sergio Vela.");

        descripcion1Lbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        descripcion1Lbl.setText("Descripción");

        descripcion2Lbl.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        descripcion2Lbl.setText("Esta aplicación ofrece a los usuarios la experiencia de aprender");

        descripcion3Lbl.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        descripcion3Lbl.setText("simples calculos avanzados mientras utilizan la calculadora.");

        versionLbl.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        versionLbl.setText("Versión:   1.0");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion3Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(descripcion1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(respuesta1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pregunta1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                            .addComponent(descripcion2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(versionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuesta1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(versionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descripcion1Lbl;
    private javax.swing.JLabel descripcion2Lbl;
    private javax.swing.JLabel descripcion3Lbl;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pregunta1Lbl;
    private javax.swing.JLabel respuesta1Lbl;
    private javax.swing.JLabel versionLbl;
    // End of variables declaration//GEN-END:variables
}
