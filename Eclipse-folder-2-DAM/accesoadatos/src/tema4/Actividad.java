package tema4;

import java.sql.DriverManager;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

public class Actividad {

    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    public static void main(String[] args) {
        // Realizar una aplicación java que conecte con la base de datos creada y muestre por 
        // pantalla que la conexión a la base de datos de Mariadb se ha realizado correctamente.
        
        final String usuario = "root";
        final String password = "root";

        Connection dbConnection = null;
        
        try {
            Class.forName(DRIVER);
            dbConnection = (Connection) DriverManager.getConnection(URL, usuario, password);
            System.out.println("Conexión realizada correctamente");

            Thread.sleep(60000);

            dbConnection.close();
            System.out.println("Conexión cerrada correctamente");
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");
        }


    }

}
