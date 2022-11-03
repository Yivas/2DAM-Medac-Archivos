package tema6.ejercicio1;

import java.util.concurrent.Semaphore;

public class Buffer extends Thread{

    private char[] buffer;
    private int siguiente;
    private boolean estaVacia;
    private boolean estaLlena;
    private static Semaphore semaforo = new Semaphore(1);
    
    public Buffer(int tamaño){
        this.buffer = new char[tamaño];
        this.siguiente = 0;
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

        siguiente--;
        this.estaLlena = false;
        if(siguiente == 0){
            this.estaVacia = true;
        }
        
        notifyAll();
        semaforo.release();
        return this.buffer[this.siguiente];
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
    
    
    

}
