package pro.calc.gestor;

import pro.calc.exception.CalcException;

public abstract class GestorCalc {

    public static String calculaAreaCuadrado(String lado) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(lado);
            var resultado = ladoNum * ladoNum;
            return String.format("%.2f * %.2f = %.2f", ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaAreaTriangulo(String base, String altura) throws CalcException {
        try {
            var baseNum = Double.parseDouble(base);
            var alturaNum = Double.parseDouble(altura);
            var resultado = (baseNum * alturaNum) / 2;
            return String.format("(%.2f * %.2f) / 2 = %.2f", baseNum, alturaNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaAreaCircunferencia(String radio) throws CalcException {
        try {
            var radioNum = Double.parseDouble(radio);
            var resultado = Math.PI * Math.pow(radioNum, 2);
            return String.format("%.2f * (%.2f * %.2f) = %.2f", Math.PI, radioNum, radioNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaVolumenCubo(String lado) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(lado);
            var resultado = Math.pow(ladoNum, 3);
            return String.format(" %.2f * %.2f * %.2f  = %.2f", ladoNum, ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }
}
