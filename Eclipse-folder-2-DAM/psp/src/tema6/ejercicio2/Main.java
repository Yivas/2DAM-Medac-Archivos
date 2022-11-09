package tema6.ejercicio2;

public class Main {

    public static void main(String[] args) {
        
        
        Buffer b = new Buffer(10);

        Productor p = new Productor(b);
 
        Consumidor c = new Consumidor(b);
        
        try {
            p.start();
            c.start();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
