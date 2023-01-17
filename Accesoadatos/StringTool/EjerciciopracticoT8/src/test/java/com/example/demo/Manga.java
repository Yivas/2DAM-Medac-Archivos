package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

// Crea una calse Java que defina operaciones para manipular los mangas en la base de 
// datos, como crear, leer, actualizar y eliminar mangas. Utiliza Hibernate para implementar 
// estas operaciones de manera eficiente y segura.

@Entity
@EnableAutoConfiguration
@Table(name="Manga")
public class Manga {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private int id;
	
	@Column(name="titulo")
    private String titulo;
	
	@Column(name="autor")
    private String autor;
    
	@Column(name="genero")
    private String genero;
    
	@Column(name="anio_publicacion")
    private int anio_publicacion;
    
	@Column(name="numero_volumenes")
    private int numero_volumenes;

    public Manga() {
    }

    public Manga(int id, String titulo, String autor, String genero, int anio_publicacion, int numero_volumenes) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio_publicacion = anio_publicacion;
        this.numero_volumenes = numero_volumenes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public int getNumero_volumenes() {
        return numero_volumenes;
    }

    public void setNumero_volumenes(int numero_volumenes) {
        this.numero_volumenes = numero_volumenes;
    }

    @Override
    public String toString() {
        return "Manga{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anio_publicacion=" + anio_publicacion + ", numero_volumenes=" + numero_volumenes + '}';
    }


}
