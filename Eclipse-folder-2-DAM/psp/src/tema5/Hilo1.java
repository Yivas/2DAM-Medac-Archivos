package tema5;

public class Hilo1 extends Thread {
    
    private String nombre;
    private int dormir;
    
    public Hilo1() {
        
    }

    public Hilo1(String nombre, int dormir) {
        this.nombre = nombre;
        this.dormir = dormir;
    }


    @Override
    public void run() {
        for (int i = 0;i<10;i++) {
            System.out.println("Soy el hilo1" + nombre + " en la iteracion " + i);
            try {
                sleep(dormir);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.toString());
            }
        }
    }

}
