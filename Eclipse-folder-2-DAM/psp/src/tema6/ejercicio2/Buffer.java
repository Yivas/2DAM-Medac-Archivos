package tema6.ejercicio2;

import java.util.concurrent.Semaphore;

public class Buffer extends Thread{

    private char[] buffer;
    private int siguiente;
    private int siguienteAConsumir;
    private boolean estaVacia;
    private boolean estaLlena;
    
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
        

        char letra = this.buffer[this.siguienteAConsumir];
        siguienteAConsumir++;
        this.estaLlena = false;
        if(siguienteAConsumir == siguiente){
            this.estaVacia = true;
        }
        notifyAll();
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
        
        
        buffer[siguiente] = letra;
        siguiente++;
        this.estaVacia = false;
        if(siguiente == this.buffer.length){
            this.estaLlena = true;
        }
        
        notifyAll();
    }

    // Getters y setters

    public int getSiguiente() {
        return siguiente;
    }
    
    public int getSiguienteAConsumir() {
        return siguienteAConsumir;
    }
    
    

}