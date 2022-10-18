package tema2.ficheros_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        // Desarrolla un programa que muestre un archivo en líneas de 80 caracteres, además
        // mostrará el texto pantalla a pantalla, en cada pantalla presenta 23 líneas. Después de
        // completar la pantalla el programa se para hasta que el usuario pulsa un tecla y entonces
        // muestra la página siguiente.

        // Preguntamos la ubicacion del archivo al usuario
        System.out.println("Introduzca la ubicación del archivo origen: ");
        Scanner sc = new Scanner(System.in);
        FileReader ruta = new FileReader(new File (sc.nextLine()));

        // Llamamos al método MostrarArchivo
        MostrarArchivo(ruta);



    }

    public static void MostrarArchivo(FileReader ruta) throws IOException {
        // Leemos el archivo linea a linea en lineas de 80 caracteres
        int caracter = ' ';
        int contador = 0;
        int contador2 = 0;
        while ((caracter = ruta.read()) != -1) {
            System.out.print((char)caracter);
            contador++;
            if (contador == 80) {
                System.out.println();
                contador = 0;
                contador2++;
                if (contador2 == 23) {
                    System.out.println("Pulse una tecla para continuar");
                    System.in.read();
                    contador2 = 0;
                }
            }
        }
        ruta.close();
    }



}
