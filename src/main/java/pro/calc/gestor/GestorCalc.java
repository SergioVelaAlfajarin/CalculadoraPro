package pro.calc.gestor;

import pro.calc.exception.CalcException;

public abstract class GestorCalc {

    public static String calculaAreaCuadrado(String lado) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(lado);
            var resultado = ladoNum * ladoNum;
            return String.format("%.2f + %.2f = %.2f", ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaAreaTriangulo(String lado, String altura) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(lado);
            var alturaNum = Double.parseDouble(altura);

            var resultado = ladoNum * alturaNum / 2;

            return String.format("( %.2f * %.2f ) /2 = %.2f", ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaAreaCircunferencia(String radio) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(radio);
            
            var resultado = ladoNum * 3;

            return String.format("( %.2f * %.2f ) * 3.14 = %.2f", radio, radio, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaVolumenCubo(String lado) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(lado);

            var resultado = ladoNum * ladoNum * ladoNum;

            return String.format(" %.2f * %.2f * %.2f  = %.2f", ladoNum, ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

}
