package pro.calc.vistas;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pro.calc.exception.CalcException;
import pro.calc.gestor.*;

public class VistaPrincipal extends javax.swing.JFrame {

    private boolean calculado = false;
    private String numAnterior;

    public void muestraWarning(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }

    private int cambia;

    public VistaPrincipal(int c) {
        initComponents();
        setIconImage();
        setVisible(true);
        setLocationRelativeTo(null);
        int color;
        color = c;
        cambia = c;
        cambiaColor(c);
        visorInpt.setText("5+2*(73/(54-33))-2");
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
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnParentesis1 = new javax.swing.JButton();
        btnParentesis2 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        visorInpt = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        exportarItem = new javax.swing.JMenuItem();
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
        jMenuItem1 = new javax.swing.JMenuItem();

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

        btn0.setText("0");
        btn0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

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

        btnSuma.setForeground(new java.awt.Color(0, 102, 153));
        btnSuma.setText("+");
        btnSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuma.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setForeground(new java.awt.Color(0, 102, 153));
        btnResta.setText("-");
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResta.setPreferredSize(new java.awt.Dimension(50, 50));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDividir.setForeground(new java.awt.Color(0, 102, 153));
        btnDividir.setText("/");
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setForeground(new java.awt.Color(0, 102, 153));
        btnMultiplicar.setText("*");
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnIgual.setForeground(new java.awt.Color(0, 153, 0));
        btnIgual.setText("=");
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIgual.setPreferredSize(new java.awt.Dimension(50, 50));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnComa.setForeground(new java.awt.Color(0, 102, 153));
        btnComa.setText(",");
        btnComa.setPreferredSize(new java.awt.Dimension(50, 50));
        btnComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComaActionPerformed(evt);
            }
        });

        btnParentesis1.setForeground(new java.awt.Color(0, 102, 153));
        btnParentesis1.setText("(");
        btnParentesis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParentesis1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnParentesis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesis1ActionPerformed(evt);
            }
        });

        btnParentesis2.setForeground(new java.awt.Color(0, 102, 153));
        btnParentesis2.setText(")");
        btnParentesis2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParentesis2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnParentesis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesis2ActionPerformed(evt);
            }
        });

        btnBorrar.setForeground(new java.awt.Color(255, 0, 51));
        btnBorrar.setText("C");
        btnBorrar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBorrarTodo.setForeground(new java.awt.Color(255, 0, 51));
        btnBorrarTodo.setText("CE");
        btnBorrarTodo.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
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

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visorInpt)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnParentesis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnParentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(visorInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnParentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        archivoMenu.setText("Archivo");

        exportarItem.setText("Exportar txt");
        exportarItem.setIconTextGap(0);
        exportarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarItemActionPerformed(evt);
            }
        });
        archivoMenu.add(exportarItem);

        opcionesItem.setText("Opciones...");
        opcionesItem.setIconTextGap(0);
        opcionesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesItemActionPerformed(evt);
            }
        });
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
        conversorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorItemActionPerformed(evt);
            }
        });
        avanzadosMenu.add(conversorItem);

        barraMenu.add(avanzadosMenu);

        ayudaMenu.setText("Ayuda");
        ayudaMenu.setIconTextGap(0);

        acercaDeItem.setText("Acerca de...");
        acercaDeItem.setIconTextGap(0);
        acercaDeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeItemActionPerformed(evt);
            }
        });
        ayudaMenu.add(acercaDeItem);

        jMenuItem1.setText("Danos tu opinión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ayudaMenu.add(jMenuItem1);

        barraMenu.add(ayudaMenu);

        setJMenuBar(barraMenu);

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

    private void cuadradoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoItemActionPerformed
        try {
            String lado = JOptionPane.showInputDialog(this, "Introduzca el lado.");
            if (lado != null) {
                visorInpt.setText(GestorArea.calculaAreaCuadrado(lado));
            }
        } catch (CalcException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_cuadradoItemActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String operacion = visorInpt.getText();

        if (operacion.length() >= 3 || operacion.contains("=")) {
            try {
                String res = GestorCalc.calcularOperacion(operacion);
                visorInpt.setText(
                        String.format("%s=%s", visorInpt.getText(), res)
                );
                numAnterior = res;
                calculado = true;
            } catch (CalcException e) {
                muestraWarning(e);
                visorInpt.setText("");
            }
        }


    }//GEN-LAST:event_btnIgualActionPerformed

    private void trianguloItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianguloItemActionPerformed
        try {
            String base = JOptionPane.showInputDialog(this, "Introduzca la base.");
            if (base != null) {
                String altura = JOptionPane.showInputDialog(this, "Introduzca la altura.");
                if (altura != null) {
                    visorInpt.setText(GestorArea.calculaAreaTriangulo(base, altura));
                }
            }
        } catch (NumberFormatException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_trianguloItemActionPerformed

    private void circunferenciaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circunferenciaItemActionPerformed
        try {
            String area = JOptionPane.showInputDialog(this, "Introduzca el radio.");
            if (area != null) {
                visorInpt.setText(GestorArea.calculaAreaCircunferencia(area));
            }
        } catch (CalcException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_circunferenciaItemActionPerformed

    private void cuboItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboItemActionPerformed
        try {
            String lado = JOptionPane.showInputDialog(this, "Introduzca el lado.");
            if (lado != null) {
                visorInpt.setText(GestorVolumen.calculaVolumenCubo(lado));
            }
        } catch (NumberFormatException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_cuboItemActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addTextVisor("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addTextVisor("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addTextVisor("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addTextVisor("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addTextVisor("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addTextVisor("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addTextVisor("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addTextVisor("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addTextVisor("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (calculado) {
            addTextVisor(numAnterior);
        }
        addTextVisor("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if (calculado) {
            addTextVisor(numAnterior);
        }
        addTextVisor("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        if (calculado) {
            addTextVisor(numAnterior);
        }
        addTextVisor("/");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if (calculado) {
            addTextVisor(numAnterior);
        }
        addTextVisor("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnParentesis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesis1ActionPerformed
        addTextVisor("(");
    }//GEN-LAST:event_btnParentesis1ActionPerformed

    private void btnParentesis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesis2ActionPerformed
        addTextVisor(")");
    }//GEN-LAST:event_btnParentesis2ActionPerformed

    private void esferaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaItemActionPerformed
        try {
            String radio = JOptionPane.showInputDialog(this, "Introduzca el radio:");
            if (radio != null) {
                visorInpt.setText(GestorVolumen.calculaVolumenEsfera(radio));
            }
        } catch (CalcException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_esferaItemActionPerformed

    private void cilindroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroItemActionPerformed
        try {
            String radio = JOptionPane.showInputDialog(this, "Introduzca el radio:");
            if (radio != null) {
                String altura = JOptionPane.showInputDialog(this, "Introduzca la altura:");
                if (altura != null) {
                    visorInpt.setText(GestorVolumen.calculaVolumenCilindro(radio, altura));
                }
            }
        } catch (NumberFormatException e) {
            muestraWarning(e);
        }
    }//GEN-LAST:event_cilindroItemActionPerformed

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
        dispose();
        //cerrar bbdd
        System.exit(0);
    }//GEN-LAST:event_salirItemActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       //Al salir borrara el fichero creado y aparecera vacio
        GestorTXT.crearfichero();
        dispose();
        //cerrar bbdd
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        visorInpt.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String texto = visorInpt.getText();
        if (texto.length() >= 1) {
            visorInpt.setText(texto.substring(0, texto.length() - 1));
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComaActionPerformed
        String a = visorInpt.getText();
        if (a.isEmpty()) {
            visorInpt.setText("0,");
        } else {
            visorInpt.setText(a + ",");
        }
    }//GEN-LAST:event_btnComaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addTextVisor("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void addTextVisor(String txt) {
        if (calculado) {
            calculado = false;
            visorInpt.setText("");
        }

        String visor = visorInpt.getText();

        if (visor.equals("0") || visor.isEmpty()) {
            visorInpt.setText(txt);
        } else {
            visorInpt.setText(visor + txt);
        }
    }

    private void acercaDeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeItemActionPerformed
        setVisible(false);
        var v = new VistaAcercaDe(this,cambia);
    }//GEN-LAST:event_acercaDeItemActionPerformed

    private void conversorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorItemActionPerformed

        setVisible(false);
        var v = new VistaConversor(this, cambia);
    }//GEN-LAST:event_conversorItemActionPerformed

    private void visorInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visorInptActionPerformed

    private void opcionesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesItemActionPerformed
        setVisible(false);
        var v = new VistaOpciones(this);

    }//GEN-LAST:event_opcionesItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        setVisible(false);
        var v = new VistaDanosTuOpinion(this,cambia);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void exportarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarItemActionPerformed
        try {
            GestorTXT.exportarFichero();
        } catch (IOException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
    }//GEN-LAST:event_exportarItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDeItem;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenu areasMenu;
    private javax.swing.JMenu avanzadosMenu;
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnComa;
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
    private javax.swing.JMenuItem opcionesItem;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JMenuItem trianguloItem;
    private javax.swing.JTextField visorInpt;
    private javax.swing.JMenu volumenMenu;
    // End of variables declaration//GEN-END:variables
}
