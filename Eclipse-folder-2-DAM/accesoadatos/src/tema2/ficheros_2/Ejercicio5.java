package tema2.ficheros_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) throws Exception {
        // Haz un programa que copie un archivo en otro carácter a carácter. Los nombres de
        // los archivos origen y destino se pasarán como argumentos.

        // Preguntamos la ubicacion del archivo origen al usuario
        System.out.println("Introduzca la ubicación del archivo origen: ");
        Scanner sc = new Scanner(System.in);
        FileReader ruta = new FileReader(new File (sc.nextLine()));

        // Preguntamos la ubicacion del archivo destino al usuario
        System.out.println("Introduzca la ubicación del archivo destino: ");
        Scanner sc2 = new Scanner(System.in);
        FileWriter ruta2 = new FileWriter(new File (sc2.nextLine()));
        
        // Llamamos al método CopiarArchivo
        CopiarArchivo(ruta, ruta2);




    }

    public static void CopiarArchivo(FileReader ruta, FileWriter ruta2) throws  Exception {
        // Leemos el archivo caracter a caracter y lo copiamos en el otro archivo
        int caracter = ' ';
        while ((caracter = ruta.read()) != -1) {
            ruta2.write(caracter);
        }
        ruta2.close();
    }

}
