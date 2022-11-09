package tema6.ejercicio2;

public class Consumidor extends Thread {

    private Buffer buffer;

    public Consumidor(Buffer buffer) {

        this.buffer = buffer;
    }

    public void run() {

        while (true) {
            if (buffer.getSiguienteAConsumir() <= buffer.getSiguiente()) {
                try {
                    char letra = this.buffer.consumir();
                    System.out.println("Recogido el caracter " + letra + " del buffer, numero " + buffer.getSiguienteAConsumir() + " del buffer");
    
                    sleep((int) (Math.random() * 4000));
                } catch (InterruptedException ex) {
                    System.out.println("Error en el consumidor");
                }
            }
            
        }

    }

}
