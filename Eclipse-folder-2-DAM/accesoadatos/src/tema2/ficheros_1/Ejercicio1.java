package tema2.ficheros_1;

import java.io.File;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Programa que muestra todas las entradas del directorio "c:\\windows"
        File fichero = new File("c:\\windows");

        // Lista de ficheros y directorios
        String[] lista = fichero.list();
        for (String s : lista) {
            System.out.println(s);
        }


    }

}
