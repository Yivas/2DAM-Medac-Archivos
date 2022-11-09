package tema6.ejercicio3;

public class Estanquero extends Thread {

    private Buffer buffer;

    public Estanquero(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            if (this.buffer.getFumando() == false) {
                int ingrediente = (int) (Math.random() * 3);
                this.buffer.poner(ingrediente);
                switch (ingrediente) {
                    case 0:
                        System.out.println("Estanquero pone papel y fosforos");
                        break;
                    case 1:
                        System.out.println("Estanquero pone tabaco y fosforos");
                        break;
                    case 2:
                        System.out.println("Estanquero pone tabaco y papel");
                        break;
                }
                try {
                    Thread.sleep((int) (Math.random() * 2000));
                } catch (InterruptedException ex) {
                    System.out.println("Error en el estanquero");
                }
            }
        }
    }



}
