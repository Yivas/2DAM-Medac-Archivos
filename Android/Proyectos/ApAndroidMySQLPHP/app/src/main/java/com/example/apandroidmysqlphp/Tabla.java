package com.example.apandroidmysqlphp;

public class Tabla {
    public static final String NOMBRE_TABLA = "nombre_tabla";
    public static final String COLUMNA_ID = "id";
    public static final String COLUMNA_NOMBRE = "nombre";

    private int id;
    private String nombre;

    public Tabla(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
