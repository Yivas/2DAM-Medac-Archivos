package calculadora5; 
 
public class Calculadora { 
    private int answer; 
    public Calculadora() { 
        answer = 0; 
    } 
    public int suma(int a, int b) { 
        answer = a + b; 
        return answer; 
    } 
    public int resta(int a, int b) { 
        answer = a - b; 
        return answer; 
    }    
    public int answer() { 
        return answer; 
    } 
    public int division(int a, int b) { 
        return a/b; 
    } 
    public void timeout() { 
        try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) { 
            // TODO: handle exception 
        } 
    } 
} 