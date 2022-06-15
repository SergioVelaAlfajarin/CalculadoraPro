package pro.calc.gestor;

import java.util.LinkedList;
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

    public static String calcularOperacion(String operacion) throws CalcException {
        LinkedList<String> ll = divideOperacion(operacion);
        System.out.println(ll);
        return null;
    }

    public static LinkedList divideOperacion(String operacion) {
        LinkedList<String> operacionDividida = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operacion.length(); i++) {
            char letra = operacion.charAt(i);
            if (Character.isDigit(letra)) {
                sb.append(letra);
            } else {
                String anterior = sb.toString();
                if (!anterior.isEmpty()) {
                    operacionDividida.add(anterior);
                }
                operacionDividida.add(letra + "");
                sb = new StringBuilder();
            }
        }
        String resto = sb.toString();
        if (!resto.isEmpty()) {
            operacionDividida.add(resto);
        }
        return operacionDividida;
    }
}
