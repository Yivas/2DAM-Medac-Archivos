package tema2.ficheros_1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        // Crear un programa en Java que borre la estructura anterior, solicitando
        // confirmación antes de borrar cada fichero o directorio y sin borrar ningún directorio que no esté vacío. 

        // Ejecutamos el método BorrarArchivos
        BorrarArchivos("C:\\TEMA1");


    }

    public static void BorrarArchivos(String ruta) {
        File directorio = new File(ruta);
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            // Preguntamos si el usuario quiere borrar el archivo o directorio
            System.out.println("¿Desea borrar el archivo o directorio " + archivo.getName() + "? (S/N)");
            Scanner sc = new Scanner(System.in);
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                // Si el archivo es un directorio, comprobamos si está vacío
                if (archivo.isDirectory()) {
                    // Si está vacío, lo borramos
                    if (archivo.list().length == 0) {
                        archivo.delete();
                    } else {
                        // Si no está vacío, llamamos al método BorrarArchivos
                        BorrarArchivos(archivo.getAbsolutePath());
                    }
                } else {
                    // Si el archivo no es un directorio, lo borramos
                    archivo.delete();
                }
            }
            
            
        }

    }

}
