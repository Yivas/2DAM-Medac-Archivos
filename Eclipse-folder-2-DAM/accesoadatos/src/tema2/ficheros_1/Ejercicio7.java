package tema2.ficheros_1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Realiza un programa que compruebe si se tiene acceso de ejecución y lectura a un
        // fichero (pasado como argumento) y después modifique sus atributos denegando estos
        // permisos. (No funcionan en Windows)

        // Pedimos el nombre del archivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo o directorio");
        String nombre = sc.nextLine();
        sc.close();

        // Creamos el objeto File
        File fichero = new File(nombre);

        // Comrobamos acceso de ejecución y lectura
        System.out.println("Tiene permiso de ejecución: " + fichero.canExecute());
        System.out.println("Tiene permiso de lectura: " + fichero.canRead());

        // Modificamos los atributos denegando estos permisos
        fichero.setExecutable(false);
        fichero.setReadable(false);


    }

}
