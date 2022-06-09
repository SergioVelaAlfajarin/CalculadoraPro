package pro.calc.gestor;

import pro.calc.exception.CalcException;

public abstract class GestorCalc {
    
    public static String calculaAreaCuadrado(String lado) throws CalcException{
        try {
            var ladoNum = Double.parseDouble(lado);
            var resultado = ladoNum * ladoNum;
            return String.format("%.2f + %.2f = %.2f", ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }
    
    
}
