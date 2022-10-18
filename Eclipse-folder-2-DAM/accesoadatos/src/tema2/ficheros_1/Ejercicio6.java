package tema2.ficheros_1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Escribe un programa que muestre los atributos de un fichero o directorio cuyo nombre se
        // pase como primer argumento.
        // Nombre del archivo
        // Camino absoluto
        // Tamaño
        // Si es Fichero
        // Si es Directorio
        // Última modificación
        // Si tiene permiso de escritura
        // Si tiene permiso de lectura:
        // Si tiene permiso de ejecución:

        // Pedimos el nombre del archivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo o directorio");
        String nombre = sc.nextLine();
        sc.close();

        // Creamos el objeto File
        File fichero = new File(nombre);

        // Mostramos los atributos
        System.out.println("Nombre del archivo: " + fichero.getName());
        System.out.println("Camino absoluto: " + fichero.getAbsolutePath());
        System.out.println("Tamaño: " + fichero.length());
        System.out.println("Es un fichero: " + fichero.isFile());
        System.out.println("Es un directorio: " + fichero.isDirectory());
        System.out.println("Última modificación: " + fichero.lastModified());
        System.out.println("Tiene permiso de escritura: " + fichero.canWrite());
        System.out.println("Tiene permiso de lectura: " + fichero.canRead());
        System.out.println("Tiene permiso de ejecución: " + fichero.canExecute());


    }

}
