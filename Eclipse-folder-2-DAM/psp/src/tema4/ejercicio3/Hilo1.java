package tema4.ejercicio3;

public class Hilo1 extends Thread {
    
    public Hilo1() { 
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    

}