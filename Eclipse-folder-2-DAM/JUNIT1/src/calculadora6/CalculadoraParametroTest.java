package calculadora6;  
import static org.junit.Assert.*;  
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters; 
 
@RunWith(value = Parameterized.class) 
public class CalculadoraParametroTest { 
    @Parameters 
    public static Iterable<Object[]> getData(){ 
        List<Object[]> obj = new ArrayList<Object[]>(); 
        obj.add(new Object[] {2,3,5}); 
        obj.add(new Object[] {2,2,4}); 
        obj.add(new Object[] {3,3,6}); 
        return obj; 
    } 
    private int a, b, esperado;  
    public CalculadoraParametroTest(int a, int b, int esperado) { 
        this.a = a; 
        this.b = b; 
        this.esperado = esperado; 
    } 
    @Test 
    public void testSuma() { 
        Calculadora calc = new Calculadora(); 
        int result = calc.suma(a, b); 
        assertEquals(esperado, result); 
    } 
} 