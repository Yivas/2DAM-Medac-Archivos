package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Consultas {
		@Autowired


	public static void main(String[] args) {
		// Hacer una consulta para obtener la lista de todos los mangas publicados
		// antes del año 2010, o para obtener el manga más reciente publicado
		// por un determinado autor.

		ArrayList<Manga> listaMangas = new ArrayList<Manga>();
		Metodos metodos = new Metodos();
		listaMangas = metodos.readAllManga();
		for (Manga manga : listaMangas) {
			System.out.println(manga);
		}
		



	}

}
