package tema2.ficheros_1;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Realiza un programa en C que cree una estructura de directorios como la siguiente,
        // donde fx son ficheros y dx son directorios,
        // /home/
        // /usr1
        // f1
        // /usr2
        // /d1
        // f2
        // /d2
        // f3
        // f4
        // /d3

        File fichero = new File("C:\\TEMA1");
        fichero.mkdir();
        File fichero1 = new File("C:\\TEMA1\\usr1");
        fichero1.mkdir();
        File fichero2 = new File("C:\\TEMA1\\usr2");
        fichero2.mkdir();
        File fichero3 = new File("C:\\TEMA1\\usr1\\f1");
        try {
            fichero3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fichero4 = new File("C:\\TEMA1\\usr2\\d1");
        fichero4.mkdir();
        File fichero5 = new File("C:\\TEMA1\\usr2\\d1\\f2");
        try {
            fichero5.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fichero6 = new File("C:\\TEMA1\\usr2\\d2");
        fichero6.mkdir();
        File fichero7 = new File("C:\\TEMA1\\usr2\\d2\\f3");
        try {
            fichero7.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fichero8 = new File("C:\\TEMA1\\usr2\\d2\\f4");
        try {
            fichero8.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fichero9 = new File("C:\\TEMA1\\usr2\\d2\\d3");
        fichero9.mkdir();



    }

}
