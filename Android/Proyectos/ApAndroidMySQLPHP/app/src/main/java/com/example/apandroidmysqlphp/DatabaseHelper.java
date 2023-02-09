package com.example.apandroidmysqlphp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Ejercicio_database.db";

    private static final String SQL_CREAR_TABLA =
            "CREATE TABLE " + Tabla.NOMBRE_TABLA + " (" +
                    Tabla.COLUMNA_ID + " INTEGER PRIMARY KEY," +
                    Tabla.COLUMNA_NOMBRE + " TEXT)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREAR_TABLA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Aquí puede escribir código para actualizar la base de datos
    }

}

