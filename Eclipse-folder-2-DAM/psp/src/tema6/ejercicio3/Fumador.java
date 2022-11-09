package tema6.ejercicio3;

public class Fumador extends Thread {

    private Buffer buffer;
    private int ingrediente;


    public Fumador(Buffer buffer, int i) {
        this.buffer = buffer;
        this.ingrediente = i;
    }

    public void run() {
        while (true) {
            if (this.buffer.comprobar(this.ingrediente)) {
                this.buffer.coger(this.ingrediente);
                this.buffer.añadirFumando();
                System.out.println("Fumador " + this.ingrediente + " fumando");
                try {
                    Thread.sleep((int) (Math.random() * 6000));
                } catch (InterruptedException ex) {
                    System.out.println("Error en el fumador " + this.ingrediente);
                }
                this.buffer.quitarFumando();
                System.out.println("Fumador " + this.ingrediente + " terminado");
            }
        }
    }

    



}
