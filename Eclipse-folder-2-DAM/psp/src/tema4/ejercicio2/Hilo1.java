package tema4.ejercicio2;

public class Hilo1 implements
Runnable {

    public Hilo1() { 
    }
    
    @Override
    public void run() {
        System.out.println("¡Hola, te saludo desde un runnable!");
    }
    
}
