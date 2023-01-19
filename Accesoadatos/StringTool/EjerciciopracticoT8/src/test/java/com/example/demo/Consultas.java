package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Consultas {
		@Autowired

		private SessionFactory factory;
	public static void main(String[] args) {
		// Hacer una consulta para obtener la lista de todos los mangas publicados
		// antes del año 2010, o para obtener el manga más reciente publicado
		// por un determinado autor.

		// Creamos un objeto de la clase Metodos
		Metodos m1 = new Metodos();
		
		// Vaciamos la tabla usando el metodo vaciarTabla
		m1.vaciarTabla("Manga");
		
		// Creamos una sentencia SQL para insertar los datos iniciales en la tabla

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

		// Ejecutamos la sentencia SQL

		m1.sentenciaSQL(sentencia);

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
		


	}

}
