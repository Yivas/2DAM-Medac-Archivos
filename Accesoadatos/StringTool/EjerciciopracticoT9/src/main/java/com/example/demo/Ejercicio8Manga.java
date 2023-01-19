package com.example.demo;

import javax.persistence.*;

// Crea  una  clase  Java  que  represente  a  cada  manga  de  la  tabla,  con  atributos  que 
// correspondan  a  cada  columna  de  la  tabla  (por  ejemplo,  "titulo",  "autor",  "genero", 
// "anio_publicacion" y "numero_volumenes"). Utiliza anotaciones de Hibernate para mapear 
// cada atributo a una columna de la tabla en la base de datos.

@Entity
@Table(name="biblioteca_manga")
public class Ejercicio8Manga {

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
	
	

}


