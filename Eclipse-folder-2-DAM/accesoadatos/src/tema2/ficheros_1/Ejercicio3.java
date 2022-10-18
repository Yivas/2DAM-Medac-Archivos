package tema2.ficheros_1;

import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Hacer un programa que liste el contenido del directorio actual y de los directorios que 
        // cuelgan de él, mostrando nombre y tipo de cada fichero o directorio. 

        File fichero = new File(".");
        File[] lista = fichero.listFiles();
        for (File x : lista) {
            if (x.isDirectory()) {
                System.out.println("/" + x.getName());
                Tree(x.getPath());
            } else {
                System.out.println("\t" + x.getName());
            }
        }

    }

    public static void Tree(String ruta) {
        // Muestra el árbol de directorios y ficheros
        File ruta_final = new File(ruta);
        File[] lista = ruta_final.listFiles();

        if (lista != null) {
        	System.out.println(ruta);
            for (File x : lista) {
                if (x.isDirectory()) {
                    System.out.println("/" + x.getName());
                    Tree(x.getPath());
                } else {
                    System.out.println("\t" + x.getName());
                }
            }
        }

    }

}
