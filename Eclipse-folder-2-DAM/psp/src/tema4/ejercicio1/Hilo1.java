package tema4.ejercicio1;

public class Hilo1 extends Thread {

    public Hilo1() {
        
    }
    
    @Override
    public void run() {
        System.out.println("¡Hola, te saludo desde un hilo!");
    }


}
