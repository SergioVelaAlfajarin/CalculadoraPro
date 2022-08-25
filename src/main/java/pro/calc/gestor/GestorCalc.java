package pro.calc.gestor;

import java.util.LinkedList;
import java.util.ListIterator;
import pro.calc.exception.CalcException;

public abstract class GestorCalc {//TODO CAMBIAR ESTE METODO ENTERO

    public static String calcularOperacion(String operacion) {
        LinkedList<Character> list=  separarOperacion(operacion);  
        String resultado = calcula(list);
        return resultado;
    }

    /**
     * separa la operacion
     * @param operacion
     * @return 
     */
    private static LinkedList<Character> separarOperacion(String operacion) {
        int oplength = operacion.length();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < oplength; i++) {
            list.addLast(operacion.charAt(i));
        }
        print(list);
        return list;
    }
    
    private static String calcula(LinkedList<Character> list) {
       
        //devolvera un objeto tipo operacion.
        //este objeto se usara para guardar en ficheros y bbdd
        //eliminar esta clase y usar por completo la clase operacion.
        
        //eliminar parentesis de la operacion
        //usando la recursividad.
        
        //si no hay parentesis recorrera la lista calculando y resolviendo
        
        return null;
    }
    
    private static void print(LinkedList<Character> l) {
        for (char c : l) {
            System.out.println(c);
        }
    }
}
