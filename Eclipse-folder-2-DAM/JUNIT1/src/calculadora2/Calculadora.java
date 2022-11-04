package calculadora2; 
 
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
    	
} 