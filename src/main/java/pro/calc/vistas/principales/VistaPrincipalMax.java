/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.calc.vistas.principales;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author sergi
 */
public class VistaPrincipalMax extends VistaPrincipal {
    public VistaPrincipalMax() {
        super(Toolkit.getDefaultToolkit().getScreenSize(), true);
    }

    @Override
    protected boolean esMaximizado() {
        return true;
    }
}
