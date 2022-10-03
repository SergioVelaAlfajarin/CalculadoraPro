package pro.calc.vistas;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pro.calc.exception.CalcException;
import pro.calc.vistas.principales.VistaPrincipal;

public class VistaDanosTuOpinion extends javax.swing.JFrame {

    private final VistaPrincipal ventana;

    public VistaDanosTuOpinion(VistaPrincipal v, int c) {
        initComponents();
        setTitle("Danos tu opinion");
        setVisible(true);
        setLocationRelativeTo(null);
        ventana = v;
        jTextArea1.setText("");
        setIconImage();
        cambiaColor(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        enviarBtn = new javax.swing.JButton();
        opinionPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tituloLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        enviarBtn.setText("Enviar");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" \n");
        opinionPane.setViewportView(jTextArea1);

        tituloLbl.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tituloLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLbl.setText("Introduce aqui tu opinion");
        tituloLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opinionPane))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(tituloLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(opinionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed

        if (jTextArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha introducido ningun texto.");
        } else {
            JOptionPane.showMessageDialog(null, "Se ha enviado satisfactoriamente.");
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_enviarBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviarBtn;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane opinionPane;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel tituloLbl;
    // End of variables declaration//GEN-END:variables
}
