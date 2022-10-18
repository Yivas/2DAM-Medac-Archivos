package tema2.ficheros_1;

import java.io.File;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Cambia después el nombre de f11.txt por f12.txt, mueve el fichero f21.txt al directorio d1 y
        // eliminando después el directorio d2. 


        // Cambio de nombre de f11.txt a f12.txt
        File fichero = new File("C:\\TEMA1\\d1\\f11.txt");
        fichero.renameTo(new File("C:\\TEMA1\\d1\\f12.txt"));

        // Mover f21.txt al directorio d1
        File fichero2 = new File("C:\\TEMA1\\d2\\f21.txt");
        fichero2.renameTo(new File("C:\\TEMA1\\d1\\f21.txt"));
        
        // Eliminar el directorio d2
        File fichero3 = new File("C:\\TEMA1\\d2");
        fichero3.delete();


    }

}
