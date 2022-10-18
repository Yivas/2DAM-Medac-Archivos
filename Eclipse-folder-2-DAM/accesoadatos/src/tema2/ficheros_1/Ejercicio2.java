package tema2.ficheros_1;

import java.io.File;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Programa que diga cuál es el directorio actual
        File fichero = new File(".");
        System.out.println(fichero.getAbsolutePath());

    }

}
