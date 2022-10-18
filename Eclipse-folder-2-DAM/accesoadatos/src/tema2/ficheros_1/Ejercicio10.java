package tema2.ficheros_1;

import java.io.File;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Hacer un programa que liste el contenido del directorio C:\TEMA1 y de los directorios
        // que cuelgan de él, mostrando nombre y tipo de cada fichero o directorio.
        
        // Ejecutamos el método LeerArchivos
        LeerArchivos("C:\\TEMA1");

        

    }


    public static void LeerArchivos(String ruta) {
        // Leemos todos los archivos de un directorio, mostando nombre y tipo
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
            }
        }

    }

}
