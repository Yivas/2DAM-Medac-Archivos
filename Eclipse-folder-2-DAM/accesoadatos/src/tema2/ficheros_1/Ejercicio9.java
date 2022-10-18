package tema2.ficheros_1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Escribir un programa que liste el contenido de un directorio pasado como argumento,
        // de cada elemento debe mostrar: tipo (fichero o directorio)., nombre y si es fichero el
        // tamaño.

        // Pedimos el nombre del directorio
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del directorio");
        String nombre = sc.nextLine();
        sc.close();

        // Ejectuamos el método LeerArchivos
        LeerArchivos(nombre);

    }

    public static void LeerArchivos(String ruta) {
        // Leemos todos los archivos de un directorio, mostando nombre, tipo y tamaño
        File directorio = new File(ruta);
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Tipo: " + (archivo.isFile()));
                LeerArchivos(archivo.getPath());
            } else {
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Tipo: " + (archivo.isFile()));
                System.out.println("Tamaño: " + archivo.length());
            }
        }

    }

}
