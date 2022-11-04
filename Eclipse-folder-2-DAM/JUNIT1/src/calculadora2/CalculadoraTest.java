package calculadora2;  
import static org.junit.Assert.*; 
import org.junit.Test; 
 
public class CalculadoraTest { 
    @Test 
    public void testSuma() { 
        Calculadora calc = new Calculadora(); 
        int resultado = calc.suma(2, 3); 
        int esperado = 5; 
        assertEquals(esperado, resultado); 
    } 
    @Test 
    public void testResta() { 
        Calculadora calc = new Calculadora(); 
        int resultado = calc.resta(3, 2); 
        int esperado = 1; 
        assertEquals(esperado, resultado); 
    } 
} 