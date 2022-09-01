/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.calc.modelo;

/**
 *
 * @author sergi
 */
public class Operacion {
    public Operacion() {}

    private String first;
    private String second;
    private Signos signo;
    
    public void setFirstNumber(String n) {
        first = n;
    }

    public void setSecondNuber(String n) {
        second = n;
    }
    
    public void setSigno(Signos s){
        signo = s;
    }
    
    public char[] getResult(){
        return null;
    }
}
