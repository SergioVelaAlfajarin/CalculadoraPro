package pro.calc.gestor;

import java.util.LinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static pro.calc.gestor.GestorCalc.*;

public class GestorCalcTest {

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcularOperacion() {
        String operacion1 = "5+2*(73/(54-33))-2";
        String operacion2 = "6*2-3+(54-2)*(50+19)";
        String operacion3 = "4+8-123*2-56";
        String operacion4 = "4-3*2+(34*42)-32";

        LinkedList<String> al1 = new LinkedList<>();
        al1.add("5");
        al1.add("+");
        al1.add("2");
        al1.add("*");
        al1.add("(");
        al1.add("73");
        al1.add("/");
        al1.add("(");
        al1.add("54");
        al1.add("-");
        al1.add("33");
        al1.add(")");
        al1.add(")");
        al1.add("-");
        al1.add("2");

        LinkedList<String> al2 = new LinkedList<>();
        al2.add("6");
        al2.add("*");
        al2.add("2");
        al2.add("-");
        al2.add("3");
        al2.add("+");
        al2.add("(");
        al2.add("54");
        al2.add("-");
        al2.add("2");
        al2.add(")");
        al2.add("*");
        al2.add("(");
        al2.add("50");
        al2.add("+");
        al2.add("19");
        al2.add(")");

        LinkedList<String> al3 = new LinkedList<>();
        al3.add("4");
        al3.add("+");
        al3.add("8");
        al3.add("-");
        al3.add("123");
        al3.add("*");
        al3.add("2");
        al3.add("-");
        al3.add("56");

        LinkedList<String> al4 = new LinkedList<>();
        al4.add("4");
        al4.add("-");
        al4.add("3");
        al4.add("*");
        al4.add("2");
        al4.add("+");
        al4.add("(");
        al4.add("34");
        al4.add("*");
        al4.add("42");
        al4.add(")");
        al4.add("-");
        al4.add("32");

        
        
    }
}
