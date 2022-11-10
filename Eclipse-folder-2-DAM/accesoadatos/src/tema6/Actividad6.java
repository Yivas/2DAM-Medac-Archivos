package tema6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Actividad6 {
    
    
    // private static String jdbcUrl = "jdbc:h2:mem:test";
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://localhost:3306/tema6";
    static String usuario = "root";
    static String password = "root";


    public static void main(String[] args) throws SQLException {
        
        // Hacer una selección de los alumnos entre 24 y 28 años ordenado dicha selección por 
        // edad de la base de datos de MariaDB
        
        Connection connection;
        connection = DriverManager.getConnection(URL, usuario, password);
        System.out.println("Conexión realizada correctamente");

        String sql = "SELECT * FROM ALUMNOS WHERE YEAR(FECHA_NACIMIENTO) BETWEEN 1993 AND 1997 ORDER BY FECHA_NACIMIENTO";

        
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        

        while (resultSet.next()) {
            System.out.println("Nombre: " + resultSet.getString("NOMBRE")
                + " Apellidos: " + resultSet.getString("APELLIDOS")
                + " Fecha de nacimiento: " + resultSet.getString("FECHA_NACIMIENTO"));
        }


        

    }

}
