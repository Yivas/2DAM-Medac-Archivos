package com.example.demo;

// Crea una interfaz Java que defina operaciones para manipular los mangas en la base de 
// datos, como crear, leer, actualizar y eliminar mangas. Utiliza Hibernate para implementar 
// estas operaciones de manera eficiente y segura.

public interface Ejercicio8Interfaz {

    public void createManga(Manga manga);
    public void readManga(int id);
    public void updateManga(Manga manga, Manga manga2);
    public void deleteManga(Manga manga);



}
