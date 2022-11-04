package calculadora3; 
import static org.junit.Assert.*; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
 
public class CalculadoraTest { 
    Calculadora calc;  
    @Before 
    public void before() { 
        System.out.println("before()"); 
        calc = new Calculadora(); 
    } 
    @After 
    public void after() { 
        System.out.println("after()"); 
    } 
    @Test 
    public void testSuma() { 
        System.out.println("testSuma()"); 
        int resultado = calc.suma(2, 3); 
        int esperado = 5; 
        assertEquals(esperado, resultado); 
    } 
    @Test 
    public void testResta() { 
        System.out.println("testResta()"); 
        int resultado = calc.resta(3, 2); 
        int esperado = 1; 
        assertEquals(esperado, resultado); 
    } 
} 