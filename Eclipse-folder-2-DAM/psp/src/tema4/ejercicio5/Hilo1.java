package tema4.ejercicio5;

public class Hilo1 extends Thread{

    public Hilo1() { 
    }
    
    @Override
    public void run() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            if ((i%2) == 0) {
                suma += i;
                System.out.println(i);
            }
        }
        System.out.println("La suma de todos es: " + suma);
        
    }
    
    
    
}
