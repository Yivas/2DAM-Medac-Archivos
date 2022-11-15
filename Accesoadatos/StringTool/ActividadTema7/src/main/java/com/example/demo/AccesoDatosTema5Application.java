package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccesoDatosTema5Application {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(AccesoDatosTema5Application.class, args);
		
		conexion();
	}

	public static void conexion() throws SQLException {
        String jdbcURL = "jdbc:h2:mem:test";
        String username = "sa";
        String password = "";
 
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        System.out.println("Connected to H2 embedded database.");
 
        String sql = "SELECT * FROM ALUMNOS WHERE YEAR (FECHA_NACIMIENTO) <= 1994 OR YEAR(FECHA_NACIMIENTO) >= 1998";
 
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
 
        int count = 0;
 
        while (resultSet.next()) {
            count++;
 
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("NOMBRE");
            System.out.println("Student #" + count + ": " + ID + ", " + name);
        }
 
        connection.close();
    }
}
