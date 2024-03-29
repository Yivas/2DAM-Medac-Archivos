package com.example.demo;

import java.util.ArrayList;

public class Consultas {

// Este archivo realmente no es usado el usardo en realidad es el archivo
// EjericioPracticoTema9Application.java , este archivo es donde se encuentra
// el codigo del ejercicio anterior, pero lo he dejado aqui. En este archivo
// se pueden observar ligeros cambios en el codigo, para ser usado con ObjectDB
	public static void main(String[] args) {
		// Hacer una consulta para obtener la lista de todos los mangas publicados
		// antes del año 2010, o para obtener el manga más reciente publicado
		// por un determinado autor.

		// Creamos un objeto de la clase Metodos
		Metodos m1 = new Metodos();
		
		// Vaciamos la tabla usando el metodo vaciarTabla
		// para que no haya datos duplicados o que interfieran
		m1.vaciarTabla("Manga");
		
		// Creamos una sentencia SQL para insertar los datos iniciales en la tabla
		// y la ejecutamos con el metodo sentenciaJSQL para asegurarnos de que
		// se encuentran en la tabla los datos que necesitamos
		String sentencia = "INSERT  INTO  Manga  (titulo,  autor,  genero,  anio_publicacion,  numero_volumenes) \r\n"
				+ "VALUES (\"One Piece\", \"Eiichiro Oda\", \"Aventura, comedia, fantasía\", 1997, 100), (\"Attack \r\n"
				+ "on Titan\", \"Hajime Isayama\", \"Acción, drama, horror\", 2009, 34), (\"Demon Slayer: Kimetsu \r\n"
				+ "no Yaiba\", \"Koyoharu Gotouge\", \"Acción, drama, fantasía\", 2016, 23), (\"My Hero Academia\", \r\n"
				+ "\"Kohei Horikoshi\", \"Acción, aventura, comedia\", 2014, 27), (\"The Promised Neverland\", \"Kaiu \r\n"
				+ "Shirai y Posuka Demizu\", \"Drama, misterio, suspense\", 2016, 22), (\"Jujutsu Kaisen\", \"Gege \r\n"
				+ "Akutami\",  \"Acción,  sobrenatural\",  2017,  24),  (\"Haikyuu!!\",  \"Haruichi  Furudate\",  \"Deportes, \r\n"
				+ "drama\", 2012, 40), (\"The Rising of the Shield Hero\", \"Aneko Yusagi\", \"Aventura, fantasía\", \r\n"
				+ "2013,  25),  (\"Dr.  Stone\",  \"Riichiro  Inagaki  y  Boichi\",  \"Ciencia  ficción,  aventura\",  2017,  24), \r\n"
				+ "(\"The Quintessential Quintuplets\", \"Negi Haruba\", \"Comedia, romance\", 2017, 21), (\"Golden \r\n"
				+ "Kamuy\", \"Satoru Noda\", \"Aventura, historia\", 2014, 29), (\"Manga Dogs\", \"John Gallagher\", \r\n"
				+ "\"Comedia, aventura\", 2011, 4), (\"Black Clover\", \"Yūki Tabata\", \"Acción, fantasía\", 2015, 28)";

		// Ejecutamos la sentencia JSQL
		m1.sentenciaJSQL(sentencia);

		// Creamos una lista de objetos Manga
		ArrayList <Manga> listaMangas = new ArrayList<Manga>();
		
		// Creamos una lista de objetos manga en la cual introduciremos los datos de la consulta
		// y comprobaremos cada manga y si su año de publicación es anterior a 2010 
		// y su autor es Eiichiro Oda lo añadiremos a la lista
		for (Manga manga : m1.readAllManga()) {
			if (manga.getAnio_publicacion() < 2010 && manga.getAutor().equals("Eiichiro Oda")) {
				listaMangas.add(manga);
			}
		}	
		
		// Imprimimos la lista de mangas
		System.out.println(listaMangas);

		// Utiliza Hibernate para realizar transacciones sobre la base de datos. Por ejemplo, podrías 
		// crear  una  transacción  que  permita  crear  un  nuevo  manga  y  actualizar  el  número  de 
		// volúmenes de otro manga en una sola operación, garantizando que ambas operaciones 
		// se realizan correctamente o que se deshacen en caso de error.

		// Creamos un objeto de un nuevo manga
		Manga Manga2 = new Manga(14,"Bleach", "Tite Kubo", "Acción, aventura, fantasía", 2001, 74);
		
		// Usando el metodo createManga de la clase Metodos creamos el nuevo manga
		m1.createManga(Manga2);
		


	}

}
