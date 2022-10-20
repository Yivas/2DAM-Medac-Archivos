package xml.Manejar_XML_con_DOM;

import java.io.Serializable;

public class Pelicula implements Serializable{
    private String titulo;
    private int añoRodaje;
    private String duracion;
    private String actor;
     
    public Pelicula(String titulo,int añoRodaje,String duracion,String actor) {
        this.titulo = titulo;
        this.añoRodaje = añoRodaje;
        this.duracion = duracion;
        this.actor = actor;
    }
     
    public String getTitulo() {
        return titulo;
    }
     
    public int getAñoRodaje() {
        return añoRodaje;
    }
     
    public String getDuracion() {
        return duracion;
    }
     
    public String getActor() {
        return actor;
    }
     
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     
    public void setAñoRodaje(int añoRodaje) {
        this.añoRodaje = añoRodaje;
    }
     
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
     
    public void setActor(String actor) {
        this.actor = actor;
    }
     
    @Override
    public String toString(){
        String cadena;
        cadena = "Titulo: "+titulo+"\nAño de Rodaje: "+añoRodaje
        +"\nDuracion: "+duracion+"\nActor Principal: "+actor;
         
        return cadena;
    }
    
}
