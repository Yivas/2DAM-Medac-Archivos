package com.example.demo;

import java.util.List;

// Crea una interfaz Java que defina operaciones para manipular los mangas en la base de 
// datos, como crear, leer, actualizar y eliminar mangas. Utiliza Hibernate para implementar 
// estas operaciones de manera eficiente y segura.

public interface Ejercicio8Interfaz {

    public void createManga(Manga manga);
    public Manga readManga(int id);
    public List<Manga> readAllManga();
    public void updateManga(Manga manga);
    public void deleteManga(Manga manga);



}
