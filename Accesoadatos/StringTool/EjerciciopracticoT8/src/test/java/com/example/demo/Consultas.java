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

		Metodos m1 = new Metodos();
		m1.sentenciaSQL(sentencia);

		List <Manga> listaMangas = null;
		listaMangas = m1.readAllManga();
		System.out.println(listaMangas.toString());
		
		
		




	}

}
