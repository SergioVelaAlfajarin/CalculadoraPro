package pro.calc.vistas;

import javax.swing.JOptionPane;
import pro.calc.exception.CalcException;
import pro.calc.gestor.GestorCalc;

public class VistaPrincipal extends javax.swing.JFrame {

    public void muestraWarning(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }

    public VistaPrincipal() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVisor = new javax.swing.JPanel();
        visorInpt = new javax.swing.JTextField();
        panelPrincipal = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnParentesis1 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnParentesis2 = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        exportarItem = new javax.swing.JMenuItem();
        tamanoMenu = new javax.swing.JMenu();
        maxItem = new javax.swing.JMenuItem();
        minItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        opcionesItem = new javax.swing.JMenuItem();
        salirItem = new javax.swing.JMenuItem();
        avanzadosMenu = new javax.swing.JMenu();
        areasMenu = new javax.swing.JMenu();
        cuadradoItem = new javax.swing.JMenuItem();
        trianguloItem = new javax.swing.JMenuItem();
        circunferenciaItem = new javax.swing.JMenuItem();
        volumenMenu = new javax.swing.JMenu();
        cuboItem = new javax.swing.JMenuItem();
        prismaItem = new javax.swing.JMenuItem();
        esferaItem = new javax.swing.JMenuItem();
        cilindroItem = new javax.swing.JMenuItem();
        conversorItem = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();
        acercaDeItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Pro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("FramePrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        visorInpt.setBackground(new java.awt.Color(204, 204, 204));
        visorInpt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        visorInpt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visorInpt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        visorInpt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        visorInpt.setEnabled(false);

        javax.swing.GroupLayout panelVisorLayout = new javax.swing.GroupLayout(panelVisor);
        panelVisor.setLayout(panelVisorLayout);
        panelVisorLayout.setHorizontalGroup(
            panelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visorInpt, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVisorLayout.setVerticalGroup(
            panelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisorLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(visorInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnParentesis1.setText("(");
        btnParentesis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParentesis1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnParentesis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesis1ActionPerformed(evt);
            }
        });

        btnSuma.setText("+");
        btnSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuma.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setText("-");
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResta.setPreferredSize(new java.awt.Dimension(50, 50));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDividir.setText("/");
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("x");
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIgual.setPreferredSize(new java.awt.Dimension(50, 50));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnParentesis2.setText(")");
        btnParentesis2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParentesis2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnParentesis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesis2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnParentesis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnParentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParentesis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        archivoMenu.setText("Archivo");

        exportarItem.setText("Exportar txt");
        exportarItem.setIconTextGap(0);
        archivoMenu.add(exportarItem);

        tamanoMenu.setText("Tamaño");
        tamanoMenu.setIconTextGap(0);

        maxItem.setText("Maximo");
        maxItem.setIconTextGap(0);
        tamanoMenu.add(maxItem);

        minItem.setText("Minimo");
        minItem.setIconTextGap(0);
        tamanoMenu.add(minItem);

        archivoMenu.add(tamanoMenu);

        jMenuItem1.setText("Limpiar");
        jMenuItem1.setIconTextGap(0);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        archivoMenu.add(jMenuItem1);

        opcionesItem.setText("Opciones...");
        opcionesItem.setIconTextGap(0);
        archivoMenu.add(opcionesItem);

        salirItem.setText("Salir");
        salirItem.setIconTextGap(0);
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        archivoMenu.add(salirItem);

        barraMenu.add(archivoMenu);

        avanzadosMenu.setText("Calculos avanzados");

        areasMenu.setText("Areas");
        areasMenu.setIconTextGap(0);

        cuadradoItem.setText("Cuadrado");
        cuadradoItem.setIconTextGap(0);
        cuadradoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoItemActionPerformed(evt);
            }
        });
        areasMenu.add(cuadradoItem);

        trianguloItem.setText("Triangulo");
        trianguloItem.setIconTextGap(0);
        trianguloItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianguloItemActionPerformed(evt);
            }
        });
        areasMenu.add(trianguloItem);

        circunferenciaItem.setText("Circunferencia");
        circunferenciaItem.setIconTextGap(0);
        circunferenciaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circunferenciaItemActionPerformed(evt);
            }
        });
        areasMenu.add(circunferenciaItem);

        avanzadosMenu.add(areasMenu);

        volumenMenu.setText("Volumen");
        volumenMenu.setIconTextGap(0);

        cuboItem.setText("Cubo");
        cuboItem.setIconTextGap(0);
        cuboItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuboItemActionPerformed(evt);
            }
        });
        volumenMenu.add(cuboItem);

        prismaItem.setText("Prisma");
        prismaItem.setIconTextGap(0);
        volumenMenu.add(prismaItem);

        esferaItem.setText("Esfera");
        esferaItem.setIconTextGap(0);
        esferaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esferaItemActionPerformed(evt);
            }
        });
        volumenMenu.add(esferaItem);

        cilindroItem.setText("Cilindro");
        cilindroItem.setIconTextGap(0);
        cilindroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroItemActionPerformed(evt);
            }
        });
        volumenMenu.add(cilindroItem);

        avanzadosMenu.add(volumenMenu);

        conversorItem.setText("Conversor...");
        conversorItem.setIconTextGap(0);
        avanzadosMenu.add(conversorItem);

        barraMenu.add(avanzadosMenu);

        ayudaMenu.setText("Ayuda");
        ayudaMenu.setIconTextGap(0);

        acercaDeItem.setText("Acerca de...");
        acercaDeItem.setIconTextGap(0);
        ayudaMenu.add(acercaDeItem);

        barraMenu.add(ayudaMenu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prismaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prismaItemActionPerformed

    }//GEN-LAST:event_prismaItemActionPerformed

    private void cuadradoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoItemActionPerformed
        try {
            String lado = JOptionPane.showInputDialog(this, "Introduzca el lado.");
            visorInpt.setText(GestorCalc.calculaAreaCuadrado(lado));
        } catch (CalcException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_cuadradoItemActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "=");
        //TODO LA OPERACION
    }//GEN-LAST:event_btnIgualActionPerformed

    private void trianguloItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianguloItemActionPerformed

        try {
            String lado = JOptionPane.showInputDialog(this, "Introduzca la base.");
            String altura = JOptionPane.showInputDialog(this, "Introduzca la altura.");
            visorInpt.setText(GestorCalc.calculaAreaTriangulo(lado, altura));
        } catch (NumberFormatException e) {
            muestraWarning(e);
        }

    }//GEN-LAST:event_trianguloItemActionPerformed

    private void circunferenciaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circunferenciaItemActionPerformed
        //No funciona
        try {
            String area = JOptionPane.showInputDialog(this, "Introduzca el radio.");
            visorInpt.setText(GestorCalc.calculaAreaCircunferencia(area));

        } catch (CalcException e) {
            muestraWarning(e);
        }


    }//GEN-LAST:event_circunferenciaItemActionPerformed

    private void cuboItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboItemActionPerformed

        try {
            String lado = JOptionPane.showInputDialog(this, "Introduzca el lado.");

            visorInpt.setText(GestorCalc.calculaVolumenCubo(lado));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No es un numero.");
        }

    }//GEN-LAST:event_cuboItemActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "/");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "x");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnParentesis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesis1ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + "(");
    }//GEN-LAST:event_btnParentesis1ActionPerformed

    private void btnParentesis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesis2ActionPerformed
        String a = visorInpt.getText();
        visorInpt.setText(a + ")");
    }//GEN-LAST:event_btnParentesis2ActionPerformed

    private void esferaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esferaItemActionPerformed

    private void cilindroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cilindroItemActionPerformed

    //salir botones

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
        dispose();
        //cerrar bbdd
        System.exit(0);
    }//GEN-LAST:event_salirItemActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dispose();
        //cerrar bbdd
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        visorInpt.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDeItem;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenu areasMenu;
    private javax.swing.JMenu avanzadosMenu;
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnParentesis1;
    private javax.swing.JButton btnParentesis2;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JMenuItem cilindroItem;
    private javax.swing.JMenuItem circunferenciaItem;
    private javax.swing.JMenuItem conversorItem;
    private javax.swing.JMenuItem cuadradoItem;
    private javax.swing.JMenuItem cuboItem;
    private javax.swing.JMenuItem esferaItem;
    private javax.swing.JMenuItem exportarItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem maxItem;
    private javax.swing.JMenuItem minItem;
    private javax.swing.JMenuItem opcionesItem;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelVisor;
    private javax.swing.JMenuItem prismaItem;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JMenu tamanoMenu;
    private javax.swing.JMenuItem trianguloItem;
    private javax.swing.JTextField visorInpt;
    private javax.swing.JMenu volumenMenu;
    // End of variables declaration//GEN-END:variables
}
