package tema4.ejercicio5;

public class Hilo2 extends Thread{

    public Hilo2() { 
    }
    
    @Override
    public void run() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            if ((i%2) == 1) {
                suma += i;
                System.out.println(i);
            }
        }
        System.out.println("La suma de todos es: " + suma);
        
    }
    
    
    
    
}
