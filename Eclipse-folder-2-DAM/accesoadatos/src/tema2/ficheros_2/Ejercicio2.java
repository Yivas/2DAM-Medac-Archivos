package tema2.ficheros_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Crea un programa que cuente las palabras que hay en un archivo de texto

        // Preguntamos la ubicacion del archivo al usuario
        System.out.println("Introduzca la ubicación del archivo: ");
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();

        // Llamamos al método ContarPalabras
        int palabras = ContarPalabras(ruta);

        // Mostramos el resultado
        System.out.println("El número de palabras es: " + palabras);
        

    }

    public static int ContarPalabras(String ruta) {
        // Contamos todas las palabras del archivo
        FileReader lector = null;
        try {
            lector = new FileReader(ruta);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedReader lector2 = new BufferedReader(lector);
        String linea = "";
        int palabras = 0;

        while (linea != null) {
            try {
                linea = lector2.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (linea != null) {
                String[] palabrasLinea = linea.split(" ");
                palabras += palabrasLinea.length;
            }
        }
        try {
            lector.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            lector2.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return palabras;
    }


}
