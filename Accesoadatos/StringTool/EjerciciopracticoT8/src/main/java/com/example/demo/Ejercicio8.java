package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Comentamos el siguiente codigo para poder usar Hibernate en vez de H2 como
// se realizo en anteriores ejercicios
/*
public class Ejercicio8 {
	 
    // private static String jdbcUrl = "jdbc:h2:mem:test";
	// para mysql es com.mysql.jdbc.Driver
	// y jdbc:mysql://
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/biblioteca_manga";
    static String usuario = "root";
    static String password = "root";


    public static void main(String[] args) throws SQLException {
        
        // 
        
        Connection connection;
        //connection = DriverManager.getConnection(URL, usuario, password);
        //System.out.println("Conexión realizada correctamente");

        String sql = "";

        
        //Statement statement = connection.createStatement();
        //ResultSet resultSet = statement.executeQuery(sql);
        

        
        

    }
    
    
    
    
    
}
*/
