package pro.calc.gestor;

import java.util.LinkedList;
import java.util.ListIterator;
import pro.calc.exception.CalcException;
import pro.calc.modelo.Operacion;
import pro.calc.modelo.Signos;

public abstract class GestorCalc {

    public static String calcularOperacion(String operacion) {
        LinkedList<Character> list = separarOperacion(operacion);
        Operacion resultado = calcula(list);
        return null;
    }

    /**
     * separa la operacion
     *
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

    private static Operacion calcula(LinkedList<Character> list) {
        int parentesisA = list.lastIndexOf('(');

        if (parentesisA >= 0) {//parentesis found
            int parentesisB = getSiguienteParentesisCierre(parentesisA, list);
            //parentesis found - any error throwed
            LinkedList<Character> sublist = (LinkedList<Character>) list.subList(parentesisA, parentesisB);

            Operacion op = calcula(sublist);

            eliminaPos(list, parentesisA, parentesisB);

            //agregar resultado a la lista original
        }
        //si no hay parentesis recorrera la lista calculando y resolviendo

        for (int i = 0; i < list.size(); i++) {
            char ca = list.get(i);
            if (ca == '*' || ca == '/') {

                StringBuilder sb1 = new StringBuilder();
                
                for (int j = i - 1; j >= 0; j--) {
                    char cb = list.get(j);
                    if(Character.isDigit(cb) || cb == ','){
                        sb1.append(cb);
                    }else{
                        break;
                    }
                }
                
                sb1.reverse();

                StringBuilder sb2 = new StringBuilder();
                
                for (int j = i + 1; j < list.size(); j++) {
                    char cb = list.get(j);
                    if(Character.isDigit(cb) || cb == ','){
                        sb2.append(cb);
                    }else{
                        break;
                    }
                }
                
                Operacion operacion = new Operacion();
                
                operacion.setFirstNumber(sb1.toString());
                operacion.setSecondNuber(sb2.toString());
                
                switch(ca){
                    case '*' -> operacion.setSigno(Signos.MULTIPLICACION);
                    case '/' -> operacion.setSigno(Signos.DIVISION);
                }
                
                //signo found
                //recorrer hacia delante y hacia atras,
                //obteniendo todo que sea un numero o una coma/punto
                //si no lo es terminara de recorrerlo y se lo agregara a un obj tipo operacion
            }
        }

        return null;
    }

    private static void eliminaPos(LinkedList<Character> list, int parentesisA, int parentesisB) {
        for (int i = 0; i < list.size(); i++) {
            if (i >= parentesisA || i <= parentesisB) {
                list.remove(i);
            }
        }
    }

    private static void print(LinkedList<Character> l) {
        for (char c : l) {
            System.out.println(c);
        }
    }

    private static int getSiguienteParentesisCierre(int parentesisA, LinkedList<Character> list) {
        for (int i = parentesisA; i < list.size(); i++) {
            if (list.get(i) == ')') {
                return i;
            }
        }
        throw new CalcException("Operacion mal formada");
    }
}
