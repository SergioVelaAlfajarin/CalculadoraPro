/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.calc.vistas.principales;

import java.awt.Dimension;

/**
 *
 * @author sergi
 */
public class VistaPrincipalMin extends VistaPrincipal {
    public VistaPrincipalMin(){
        super(new Dimension(296, 485), false);
    }

    @Override
    protected boolean esMaximizado() {
        return false;
    }
}
