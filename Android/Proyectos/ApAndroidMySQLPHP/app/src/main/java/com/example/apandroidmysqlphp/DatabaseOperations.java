package com.example.apandroidmysqlphp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseOperations {

    private final DatabaseHelper dbHelper;
    private SQLiteDatabase database;

    public DatabaseOperations(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void insertData(String nombre, int id) {
        ContentValues values = new ContentValues();
        values.put(Tabla.COLUMNA_NOMBRE, nombre);
        values.put(Tabla.COLUMNA_ID, id);

        database.insert(Tabla.NOMBRE_TABLA, null, values);
    }

    public Cursor getData() {
        return database.query(Tabla.NOMBRE_TABLA,
                new String[]{Tabla.COLUMNA_ID, Tabla.COLUMNA_NOMBRE},
                null, null, null, null, null);
    }

    public void updateData(String nombre, int id) {
        ContentValues values = new ContentValues();
        values.put(Tabla.COLUMNA_NOMBRE, nombre);

        database.update(Tabla.NOMBRE_TABLA, values, Tabla.COLUMNA_ID + "=?",
                new String[]{String.valueOf(id)});
    }

    public void deleteData(int id) {
        database.delete(Tabla.NOMBRE_TABLA, Tabla.COLUMNA_ID + "=?",
                new String[]{String.valueOf(id)});
    }
}