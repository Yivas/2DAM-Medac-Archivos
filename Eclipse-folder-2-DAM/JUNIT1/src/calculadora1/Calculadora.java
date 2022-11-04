package calculadora1;

public class Calculadora {
	
    private static int answer;  
    public Calculadora() { 
        answer = 0; 
    } 
    public static int suma(int a, int b) { 
        answer = a + b; 
        return answer; 
    } 
    public static int resta(int a, int b) { 
        answer = a - b; 
        return answer; 
    } 

}
