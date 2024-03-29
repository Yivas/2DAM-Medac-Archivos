package com.example.demo;

import java.util.ArrayList;
import java.util.List;

// Crea una interfaz Java que defina operaciones para manipular los mangas en la base de 
// datos, como crear, leer, actualizar y eliminar mangas. Utiliza Hibernate para implementar 
// estas operaciones de manera eficiente y segura.

// Creo la interfaz con los métodos que voy a utilizar para manipular los mangas en la base de datos
public interface Ejercicio9Interfaz {

    public void createManga(Manga manga);
    public Manga readManga(int id);
    public List<Manga> readAllManga();
    public void updateManga(Manga manga);
    public void deleteManga(Manga manga);



}
