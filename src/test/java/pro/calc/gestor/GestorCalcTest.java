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
        String[] operaciones = {
            "5+2*(73/(54-33))-2",
            "6*2-3+(54-2)*(50+19)",
             "4+8-123*2-56",
             "4-3*2+(34*42)-32",
             "8*2",
             "7+3*3+3",
             "2*(13-4)/201+2*3",
        };
        
        String[] resultados = {
            "9,96",
            "3597",
            "-290",
            "1394",
            "16",
            "19",
            "6,09"
        };
        
        for (int i = 0; i < resultados.length; i++) {
            String operacion = operaciones[i];
            String resultado = resultados[i];
            
            String opCalculada = GestorCalc.calcularOperacion(operacion);
            
            assertEquals(resultado, opCalculada);
        }
    }
}
