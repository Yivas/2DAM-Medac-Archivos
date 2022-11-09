package tema6.ejercicio2;

import java.util.concurrent.Semaphore;

public class Buffer extends Thread{

    private char[] buffer;
    private int siguiente;
    private int siguienteAConsumir;
    private boolean estaVacia;
    private boolean estaLlena;
    private static Semaphore semaforo = new Semaphore(1);
    
    public Buffer(int tamaño){
        this.buffer = new char[tamaño];
        this.siguiente = 0;
        this.siguienteAConsumir = 0;
        this.estaVacia = true;
        this.estaLlena = false;
    }
    
    public synchronized char consumir(){

        while(this.estaVacia){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error en consumir()");
            }
        }
        
        try {
            semaforo.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        char letra = this.buffer[this.siguienteAConsumir];
        siguienteAConsumir++;
        this.estaLlena = false;
        if(siguienteAConsumir == siguiente){
            this.estaVacia = true;
        }
        notifyAll();
        semaforo.release();
        return letra;
    }
    
    public synchronized void producir(char letra){
        
        while(this.estaLlena){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error en producir()");
            }
        }
        
        try {
            semaforo.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        buffer[siguiente] = letra;
        siguiente++;
        this.estaVacia = false;
        if(siguiente == this.buffer.length){
            this.estaLlena = true;
        }
        
        notifyAll();
        
        semaforo.release();
    }

    // Getters y setters

    public int getSiguiente() {
        return siguiente;
    }
    
    public int getSiguienteAConsumir() {
        return siguienteAConsumir;
    }
    
    

}