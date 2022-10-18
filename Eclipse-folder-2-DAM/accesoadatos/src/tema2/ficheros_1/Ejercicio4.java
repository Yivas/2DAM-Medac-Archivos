package tema2.ficheros_1;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Realiza un programa que cree la estructura de directorios y ficheros siguiente, 
        //
        //
        //<C:TEMA1> 
        //<d1> 
        //                   |-------- f11.txt 
        // 
        //<d2> 
        //                  |-------- f21.txt 
        
        File fichero = new File("C:\\TEMA1");
        fichero.mkdir();
        File fichero1 = new File("C:\\TEMA1\\d1");
        fichero1.mkdir();
        File fichero2 = new File("C:\\TEMA1\\d2");
        fichero2.mkdir();
        File fichero3 = new File("C:\\TEMA1\\d1\\f11.txt");
        try {
            fichero3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fichero4 = new File("C:\\TEMA1\\d2\\f21.txt");
        try {
            fichero4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }

}
