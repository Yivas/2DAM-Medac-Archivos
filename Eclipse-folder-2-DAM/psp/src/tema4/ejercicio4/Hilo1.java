package tema4.ejercicio4;

public class Hilo1 extends Thread {
    
    
    String nombre;
    
    public Hilo1(String nombre) { 
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(nombre + " esta en el kilometro " + i);
            try {
                sleep(3500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " llego a la meta");
    }
    
    

}
