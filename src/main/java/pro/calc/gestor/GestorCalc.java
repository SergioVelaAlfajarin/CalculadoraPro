package pro.calc.gestor;

import java.util.LinkedList;
import java.util.ListIterator;
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
        LinkedList<String> lista = divideOperacion(operacion);
        System.out.println(lista);
        //int tieneParentesis = compruebaSiParentesis(lista);
        calcula(lista);

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
                    operacionDividida.addLast(anterior);
                }
                operacionDividida.add(letra + "");
                sb = new StringBuilder();
            }
        }
        String resto = sb.toString();
        if (!resto.isEmpty()) {
            operacionDividida.addLast(resto);
        }
        return operacionDividida;
    }

    private static int getPosUltParentesisApertura(LinkedList<String> lista) {
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("(")) {
                pos = i;
            }
        }
        return pos;
    }

    private static int getPosPriParentesisCierre(LinkedList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(")")) {
                return i;
            }
        }
        return -1;
    }

    private static String calcula(LinkedList<String> lista) {
        int posPrimerPar = getPosUltParentesisApertura(lista);

        if (posPrimerPar >= 0) {
            int posUltimoPar = getPosPriParentesisCierre(lista);
            if (posPrimerPar < 0) {
                throw new CalcException("Operacion mal formada");
            }

            LinkedList<String> subLista = obtenerSubLista(lista, posPrimerPar, posUltimoPar);
            System.out.println("SubLista: " + subLista);
            lista.removeAll(subLista);
            String resParentesis = calcula(subLista);
            lista.add(posPrimerPar, resParentesis);
            System.out.println("lista sin parentesis: " + lista);
        } else {
            boolean haySimbolos = haySimbolos(lista, "*", "/");
            while (haySimbolos) {
                int posPrimerSigno = getPosPrimerSigno(lista, "*", "/");
                if (posPrimerSigno <= 0 || posPrimerSigno >= lista.size()) {
                    throw new CalcException("Operacion mal formada.");
                }

                String posAnterior = lista.get(posPrimerSigno - 1);
                String posSiguiente = lista.get(posPrimerSigno + 1);
                double num1 = Double.parseDouble(posAnterior);
                double num2 = Double.parseDouble(posSiguiente);
                double resultado;
                if (lista.get(posPrimerSigno).equals("*")) {
                    resultado = num1 * num2;
                } else {
                    resultado = num1 / num2;
                }

                lista.add(posPrimerSigno - 1, resultado + "");
                eliminaOperaciones(lista, posPrimerSigno);
                haySimbolos = haySimbolos(lista, "*", "/");
                System.out.println(lista);
            }

            haySimbolos = haySimbolos(lista, "+", "-");
            while (haySimbolos) {
                int posPrimerSigno = getPosPrimerSigno(lista, "+", "-");
                if (posPrimerSigno <= 0 || posPrimerSigno >= lista.size()) {
                    throw new CalcException("Operacion mal formada.");
                }

                String posAnterior = lista.get(posPrimerSigno - 1);
                String posSiguiente = lista.get(posPrimerSigno + 1);
                double num1 = Double.parseDouble(posAnterior);
                double num2 = Double.parseDouble(posSiguiente);
                double resultado;
                if (lista.get(posPrimerSigno).equals("+")) {
                    resultado = num1 + num2;
                } else {
                    resultado = num1 - num2;
                }

                lista.add(posPrimerSigno - 1, resultado + "");
                eliminaOperaciones(lista, posPrimerSigno);
                haySimbolos = haySimbolos(lista, "-", "+");
                System.out.println(lista);
            }
        }

        return lista.getFirst();
    }

    private static void eliminaOperaciones(LinkedList<String> lista, int posPrimerSigno) {
        ListIterator<String> it = lista.listIterator();
        int contador = 0;
        while (it.hasNext()) {
            it.next();
            if (contador == posPrimerSigno) {
                it.remove();
                it.next();
                it.remove();
                it.next();
                it.remove();
                break;
            }
            contador++;
        }
    }

    private static boolean haySimbolos(LinkedList<String> lista, String... simbolos) {
        for (String element : lista) {
            for (String sim : simbolos) {
                if (element.equals(sim)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int getPosPrimerSigno(LinkedList<String> lista, String... simbolos) {
        for (int i = 0; i < lista.size(); i++) {
            for (String sim : simbolos) {
                if (lista.get(i).equals(sim)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static LinkedList<String> obtenerSubLista(LinkedList<String> lista, int posPrimerPar, int posUltimoPar) {
        LinkedList<String> listaTemp = new LinkedList<>();
        int counter = 0;
        for (String s : lista) {
            if (posPrimerPar < counter && counter < posUltimoPar) {
                listaTemp.addLast(s);
            }
            counter++;
        }
        System.out.println("listaTemp: " + listaTemp);
        return listaTemp;
    }

}
