package tema6.ejercicio2;

public class Productor extends Thread {

    private Buffer buffer;
    private final String letras = "abcdefghijklmnñopqrstuvxyz";

    public Productor(Buffer buffer){
        this.buffer = buffer;
    }
    
    public void run(){

        while(true){
            if (buffer.getSiguiente() < 10) {
                try {
                    char letra = letras.charAt((int) (Math.random() * letras.length()));
                    buffer.producir(letra);
                    System.out.println("Depositado el caracter " + letra + " del buffer, numero " + buffer.getSiguiente() + " del buffer");
                    
                    sleep((int) (Math.random() * 4000));
                } catch (InterruptedException ex) {
                    System.out.println("Error en el productor");
                }
            }
            
        }

    }

}
