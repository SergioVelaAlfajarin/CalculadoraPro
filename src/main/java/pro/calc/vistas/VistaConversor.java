package pro.calc.vistas;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import pro.calc.exception.CalcException;

public class VistaConversor extends javax.swing.JFrame {

    private JFrame ventana;

    public VistaConversor(JFrame v, int c) {
        initComponents();
        setIconImage();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Conversor");
        ventana = v;
        cambiaColor(c);
    }

    
    private void cambiaColor(int c) {
        if (c == 1) {
            getContentPane().setBackground(Color.RED);
            panelPrincipal.setBackground(Color.RED);
        } else if (c == 2) {
            getContentPane().setBackground(Color.GRAY);
            panelPrincipal.setBackground(Color.GRAY);
        } else if (c == 3) {
            getContentPane().setBackground(Color.WHITE);
            panelPrincipal.setBackground(Color.WHITE);
        } else if (c == 4) {
            getContentPane().setBackground(Color.GREEN);
            panelPrincipal.setBackground(Color.GREEN);
        } else if (c == 5) {
            getContentPane().setBackground(Color.YELLOW);
            panelPrincipal.setBackground(Color.YELLOW);
        } else if (c == 6) {
            getContentPane().setBackground(Color.BLUE);
            panelPrincipal.setBackground(Color.BLUE);
        }
    }
    
    private void setIconImage() {
        File f = new File("../resources/icon.png");
        if (!f.exists()) {
            f = new File("resources/icon.png");
        }
        if (!f.exists()) {
            throw new CalcException("Icono no encontrado");
        }
        ImageIcon img = new ImageIcon(f.getAbsolutePath());
        setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        aLbl = new javax.swing.JLabel();
        destinoCmbbx = new javax.swing.JComboBox<>();
        tituloLbl = new javax.swing.JLabel();
        origenCmbbx = new javax.swing.JComboBox<>();
        visorInpt = new javax.swing.JTextField();
        indicadorLbl = new javax.swing.JLabel();
        cantidadInpt = new javax.swing.JTextField();
        resultadoLbl = new javax.swing.JLabel();
        convertirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        aLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        aLbl.setText("A");

        destinoCmbbx.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        destinoCmbbx.setEnabled(false);
        destinoCmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoCmbbxActionPerformed(evt);
            }
        });

        tituloLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        tituloLbl.setText("Selector de conversor");

        origenCmbbx.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        origenCmbbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Euros", "Dolares", "Binario", "Decimal", "Hexadecimal", "Octal" }));
        origenCmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenCmbbxActionPerformed(evt);
            }
        });

        visorInpt.setBackground(new java.awt.Color(204, 204, 204));
        visorInpt.setFont(new java.awt.Font("Cascadia Code", 1, 16)); // NOI18N
        visorInpt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visorInpt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        visorInpt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        visorInpt.setEnabled(false);
        visorInpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorInptActionPerformed(evt);
            }
        });

        indicadorLbl.setText("Cantidad a convertir:");

        cantidadInpt.setEditable(false);
        cantidadInpt.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        cantidadInpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadInptActionPerformed(evt);
            }
        });

        resultadoLbl.setText("Resultado:");

        convertirBtn.setText("Convertir");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(tituloLbl))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(aLbl))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(origenCmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(resultadoLbl)
                        .addComponent(indicadorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(destinoCmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(visorInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(cantidadInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(convertirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(origenCmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destinoCmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(indicadorLbl)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convertirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidadInpt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(resultadoLbl)
                .addGap(18, 18, 18)
                .addComponent(visorInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ventana.setVisible(true);
        dispose();

    }//GEN-LAST:event_formWindowClosed

    private void visorInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visorInptActionPerformed

    private void origenCmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenCmbbxActionPerformed
        cambiarComboDestino(origenCmbbx.getSelectedIndex());
    }//GEN-LAST:event_origenCmbbxActionPerformed

    private void cantidadInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadInptActionPerformed

    private void destinoCmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoCmbbxActionPerformed
        if(destinoCmbbx.getSelectedIndex() != 0){
            cantidadInpt.setEditable(true);
        }else{
            cantidadInpt.setText("");
            cantidadInpt.setEditable(false);
        }
    }//GEN-LAST:event_destinoCmbbxActionPerformed

    private void cambiarComboDestino(Integer selectedItem) {
        switch (selectedItem) {
            case 0 ->
                rellenarComboDestino();
            case 1 ->
                rellenarComboDestino("Selecciona...", "Dolares");
            case 2 ->
                rellenarComboDestino("Selecciona...","Euros");
            case 3 ->
                rellenarComboDestino("Selecciona...","Decimal", "Octal", "Hexadecimal");
            case 4 ->
                rellenarComboDestino("Selecciona...","Selecciona...","Binario", "Octal", "Hexadecimal");
            case 5 ->
                rellenarComboDestino("Selecciona...","Decimal", "Octal", "Binario");
            case 6 ->
                rellenarComboDestino("Selecciona...","Decimal", "Binario", "Hexadecimal");
        }
    }

    private void rellenarComboDestino(String... elements) {
        destinoCmbbx.removeAllItems();
        if (elements.length == 0) {
            destinoCmbbx.setEnabled(false);
            cantidadInpt.setText("");
            cantidadInpt.setEditable(false);
        } else {
            destinoCmbbx.setEnabled(true);
            for (String e : elements) {
                destinoCmbbx.addItem(e);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLbl;
    private javax.swing.JTextField cantidadInpt;
    private javax.swing.JButton convertirBtn;
    private javax.swing.JComboBox<String> destinoCmbbx;
    private javax.swing.JLabel indicadorLbl;
    private javax.swing.JComboBox<String> origenCmbbx;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel resultadoLbl;
    private javax.swing.JLabel tituloLbl;
    private javax.swing.JTextField visorInpt;
    // End of variables declaration//GEN-END:variables
}
