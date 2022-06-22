package pro.calc.gestor;

import java.util.LinkedList;
import java.util.ListIterator;
import pro.calc.exception.CalcException;

public abstract class GestorCalc {

    //areas
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

    //volumenes
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

    // funcion de calcular
    public static String calcularOperacion(String operacion) throws CalcException {
        LinkedList<String> lista = divideOperacion(operacion);
        System.out.println(lista);
        return calcula(lista);
    }

    public static LinkedList divideOperacion(String operacion) {
        var opDividida = new LinkedList<String>();
        var arrOperacion = operacion.toCharArray();
        var sb = new StringBuilder();

        for (int i = 0; i < arrOperacion.length; i++) {
            char letra = arrOperacion[i];
            //si es un digito lo agrega al sb
            if (Character.isDigit(letra)) {
                sb.append(letra);
            } //si no, añade el valor que tenga el sb a la linkedlist si no esta vacio,
            //y añade la letra actual a la linkedlist. Por ultimo, resetea el sb
            else {
                String anterior = sb.toString();
                if (!anterior.isEmpty()) {
                    opDividida.addLast(anterior);
                }
                opDividida.addLast(letra + "");
                sb = new StringBuilder();
            }
        }

        //comprueba si ha quedado algun valor sobrante en el sb
        //y si es asi lo añade a la linkedlist
        String resto = sb.toString();
        if (!resto.isEmpty()) {
            opDividida.addLast(resto);
        }
        return opDividida;
    }

    private static String calcula(LinkedList<String> lista) {
        int posPrimerPar = getPosUltParentesisApertura(lista);

        if (posPrimerPar >= 0) {
            int posUltimoPar = getPosPriParentesisCierre(lista);
            if (posUltimoPar < 0) {
                throw new CalcException("Operacion mal formada");
            }

            LinkedList<String> subLista = obtenerSubLista(lista, posPrimerPar, posUltimoPar);

            System.out.println("SubLista: " + subLista);

            String resParentesis = calcula(subLista);

            eliminaRango(lista, posPrimerPar, posUltimoPar);

            lista.add(posPrimerPar, resParentesis);

            System.out.println("lista sin parentesis: " + lista);

            return calcula(lista);
        } else {
            boolean haySimbolos = haySimbolos(lista, "*", "/");
            while (haySimbolos) {
                int posPrimerSigno = getPosPrimerSigno(lista, "*", "/");
                realizaOperacion(lista, posPrimerSigno);
                haySimbolos = haySimbolos(lista, "*", "/");
                System.out.println(lista);
            }

            haySimbolos = haySimbolos(lista, "+", "-");
            while (haySimbolos) {
                int posPrimerSigno = getPosPrimerSigno(lista, "+", "-");
                realizaOperacion(lista, posPrimerSigno);
                haySimbolos = haySimbolos(lista, "-", "+");
                System.out.println(lista);
            }
        }

        return lista.getFirst();
    }

    private static int getPosUltParentesisApertura(LinkedList<String> lista) {
        return lista.lastIndexOf("(");
    }

    private static int getPosPriParentesisCierre(LinkedList<String> lista) {
        return lista.indexOf(")");
    }

    private static void realizaOperacion(LinkedList<String> lista, int posSigno) {
        String numAnterior = lista.get(posSigno - 1);
        String numSiguiente = lista.get(posSigno + 1);
        String signo = lista.get(posSigno);
        
        double num1 = Double.parseDouble(numAnterior);
        double num2 = Double.parseDouble(numSiguiente);
        double resultado;
        
        switch (signo) {
            case "*" ->
                resultado = num1 * num2;
            case "/" ->
                resultado = num1 / num2;
            case "+" ->
                resultado = num1 + num2;
            case "-" ->
                resultado = num1 - num2;
            default ->
                throw new CalcException("signo invalido");
        }

        eliminaRango(lista, posSigno - 1, posSigno + 1);

        lista.add(posSigno - 1, resultado + "");
    }

    private static void eliminaRango(LinkedList<String> lista, int primer, int ultimo) {
        ListIterator<String> it = lista.listIterator();
        int contador = 0;
        while (it.hasNext()) {
            it.next();
            if (contador >= primer && contador <= ultimo) {
                it.remove();
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

    private static LinkedList<String> obtenerSubLista(LinkedList<String> lista, int inicio, int fin) {
        LinkedList<String> listaTemp = new LinkedList<>();
        int counter = 0;
        for (String s : lista) {
            if (inicio < counter && counter < fin) {
                listaTemp.addLast(s);
            }
            counter++;
        }
        return listaTemp;
    }

}
