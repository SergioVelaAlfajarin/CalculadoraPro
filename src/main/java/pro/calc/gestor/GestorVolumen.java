package pro.calc.gestor;

import pro.calc.exception.CalcException;

public abstract class GestorVolumen {

    public static String calculaVolumenCubo(String lado) throws CalcException {
        try {
            var ladoNum = Double.parseDouble(lado);
            var resultado = Math.pow(ladoNum, 3);
            return String.format(" %.2f * %.2f * %.2f  = %.2f", ladoNum, ladoNum, ladoNum, resultado);
        } catch (NumberFormatException e) {
            throw new CalcException("No es un numero valido.");
        }
    }

    public static String calculaVolumenEsfera(String radio) {
        var radioNum = Double.parseDouble(radio);
        var volumen = 4 / 3 * Math.PI * Math.pow(radioNum, 3);
        return String.format("4/3 * %.2f * (%.2f * %.2f * %.2f) = %.2f", Math.PI, radioNum, radioNum, radioNum, volumen);
    }

    public static String calculaVolumenCilindro(String radio, String altura) {
        var radioNum = Double.parseDouble(radio);
        var alturaNum = Double.parseDouble(altura);
        var resultado = Math.PI * Math.pow(radioNum, 2) * alturaNum;
        return String.format("%.2f * (%.2f * %.2f) * %.2f = %.2f", Math.PI, radioNum, radioNum, alturaNum, resultado);
    }
}
