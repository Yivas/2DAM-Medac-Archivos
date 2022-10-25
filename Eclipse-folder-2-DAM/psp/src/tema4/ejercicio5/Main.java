package tema4.ejercicio5;

public class Main {

    public static void main(String[] args) {

        Hilo1 hilo1 = new Hilo1();
        
        hilo1.start();
        
        if (hilo1.isAlive()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        Hilo2 hilo2 = new Hilo2();
        
        hilo2.start();
        
        

    }

}
