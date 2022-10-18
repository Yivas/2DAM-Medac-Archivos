package tema2.ficheros_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Escriba un programa en Java que lea un fichero de texto con varias líneas y cuente cuantas
        // vocales hay de cada tipo (a,e,i,o,u). Para almacenar el número de vocales usa un array de 5
        // posiciones

        // Preguntamos la ubicacion del archivo al usuario
        System.out.println("Introduzca la ubicación del archivo: ");
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        
        // Creamos un array de 5 posiciones para almacenar el número de vocales
        int[] vocales = new int[5];

        // Llamamos al método ContarVocales
        ContarVocales(ruta, vocales); 

        // Mostramos el resultado
        System.out.println("El número de vocales es: ");
        System.out.println("a: " + vocales[0]);
        System.out.println("e: " + vocales[1]);
        System.out.println("i: " + vocales[2]);
        System.out.println("o: " + vocales[3]);
        System.out.println("u: " + vocales[4]);
              
    }

    public static void ContarVocales(String ruta, int[] vocales) {
        // Contamos las vocales del archivo
        FileReader lector = null;
        try {
            lector = new FileReader(ruta);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int letra = 0;
        try {
            letra = lector.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (letra != -1) {
            if (letra == 'a') {
                vocales[0]++;
            } else if (letra == 'e') {
                vocales[1]++;
            } else if (letra == 'i') {
                vocales[2]++;
            } else if (letra == 'o') {
                vocales[3]++;
            } else if (letra == 'u') {
                vocales[4]++;
            }
            try {
                letra = lector.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            lector.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
