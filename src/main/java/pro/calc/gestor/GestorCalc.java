package pro.calc.gestor;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import pro.calc.exception.CalcException;
import pro.calc.modelo.Operacion;

public abstract class GestorCalc {

    private static LinkedList<String> operacionList = new LinkedList<>();

    private static void setLista(String operacion) {
        operacionList = divideOperacion(operacion);
    }

    private static LinkedList divideOperacion(String operacion) {
        var opDividida = new LinkedList<String>();
        var arrOperacion = operacion.toCharArray();
        var sb = new StringBuilder();

        for (int i = 0; i < arrOperacion.length; i++) {
            char letra = arrOperacion[i];
            //si es un digito lo agrega al sb
            if (Character.isDigit(letra) || letra == ',') {
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

    public static String calcularOperacion(String operacion) throws CalcException {
        setLista(operacion);

        if (operacionList.isEmpty()) {
            throw new CalcException("Tienes que establecer la lista antes de calcular la operacion.");
        }

        try {
            String resultado = calcula(operacionList);
            return resultado;
        } catch (Exception e) {
            throw new CalcException("Operacion mal formada");
        }
    }

    private static String calcula(LinkedList<String> lista) {
        int ultimoParAper = getPosUltParentesisApertura(lista);

        if (ultimoParAper >= 0) {
            int primerParCier = getPosPriParentesisCierre(ultimoParAper, lista);
            if (primerParCier < 0) {
                throw new CalcException("Operacion mal formada");
            }

            LinkedList<String> subLista = obtenerSubLista(lista, ultimoParAper, primerParCier);
            String resParentesis = calcula(subLista);
            eliminaRango(lista, ultimoParAper, primerParCier);
            lista.add(ultimoParAper, resParentesis);

            return calcula(lista);
        } else {
            boolean haySimbolos = haySimbolos(lista, "*", "/");
            while (haySimbolos) {
                int posPrimerSigno = getPosPrimerSigno(lista, "*", "/");
                realizaOperacion(lista, posPrimerSigno);
                haySimbolos = haySimbolos(lista, "*", "/");
            }
            haySimbolos = haySimbolos(lista, "+", "-");
            while (haySimbolos) {
                int posPrimerSigno = getPosPrimerSigno(lista, "+", "-");
                realizaOperacion(lista, posPrimerSigno);
                haySimbolos = haySimbolos(lista, "-", "+");
            }
        }

        return lista.getFirst();
    }

    private static int getPosUltParentesisApertura(LinkedList<String> lista) {
        return lista.lastIndexOf("(");
    }

    private static int getPosPriParentesisCierre(int posApertura, LinkedList<String> lista) {
        for (int i = posApertura; i < lista.size(); i++) {
            String pos = lista.get(i);
            if (pos.equals(")")) {
                return i;
            }
        }
        return -1;
    }

    private static void realizaOperacion(LinkedList<String> lista, int posSigno) {
        String numAnterior = lista.get(posSigno - 1);
        String numSiguiente = lista.get(posSigno + 1);
        String signo = lista.get(posSigno);

        Operacion op = new Operacion(numAnterior, numSiguiente);

        String res = op.calcular(signo);
        eliminaRango(lista, posSigno - 1, posSigno + 1);

        lista.add(posSigno - 1, res);
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

    // CONVERSOR ---------------------------------------------------------------------------------------------------------------------
    public static String calcularConversion(String origen, String destino, String num) {
        origen = origen.toLowerCase(Locale.ROOT);
        destino = destino.toLowerCase(Locale.ROOT);

        return switch (origen) {
            case "euros" ->
                convertirEuros(num);
            case "dolares" ->
                convertirDolares(num);
            case "binario" ->
                convertirBinario(destino, num);
            case "decimal" ->
                convertirDecimal(destino, num);
            case "hexadecimal" ->
                convertirHexadecimal(destino, num);
            case "octal" ->
                convertirOctal(destino, num);
            default ->
                null;
        };
    }

    private static String convertirEuros(String num) {//-> a dolares
        return (Double.parseDouble(num) * 1.01) + "";
    }

    private static String convertirDolares(String num) {//-> a euros
        return (Double.parseDouble(num) * 0.99) + "";
    }

    private static String convertirBinario(String destino, String num) {
        return Integer.toString(Integer.parseInt(num), switch (destino) {
            case "hexadecimal" ->
                16;
            case "octal" ->
                8;
            default ->
                10;
        });
    }

    private static String convertirDecimal(String destino, String num) {
        return Integer.toString(Integer.parseInt(num), switch (destino) {
            case "binario" ->
                2;
            case "hexadecimal" ->
                16;
            default ->
                8;
        });
    }

    private static String convertirHexadecimal(String destino, String num) {
        return Integer.toString(Integer.parseInt(num), switch (destino) {
            case "binario" ->
                2;
            case "octal" ->
                8;
            default ->
                10;
        });
    }

    private static String convertirOctal(String destino, String num) {
        return Integer.toString(Integer.parseInt(num), switch (destino) {
            case "binario" ->
                2;
            case "hexadecimal" ->
                16;
            default ->
                10;
        });
    }
}
