package calculadora5; 
import static org.junit.Assert.*; 
import org.junit.*; 
 
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
    @Test 
    public void testDivision() { 
        System.out.println("division()"); 
        int resultado = calc.division(4, 2); 
        int esperado = 2; 
        assertEquals(esperado, resultado); 
    } 
    @Test(expected = ArithmeticException.class) 
    public void testDivisionExcep() { 
        System.out.println("divisionExcep()"); 
        calc.division(5, 0);
    } 
    @Test(timeout = 2500) 
    public void testTimeout() { 
        System.out.println("timeout()"); 
        calc.timeout(); 
    } 
    @BeforeClass 
    public static void beforeClass() { 
        System.out.println("beforeClass()"); 
    } 
    @AfterClass 
    public static void afterClass() { 
        System.out.println("afterClass()"); 
    }
    
    
} 
