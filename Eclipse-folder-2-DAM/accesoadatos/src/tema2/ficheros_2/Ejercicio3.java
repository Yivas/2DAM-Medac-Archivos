package tema2.ficheros_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        // Tenemos un fichero de texto que contiene varias líneas y necesitamos imprimir las iniciales de
        // todas las palabras que aparecen en el mismo. Realizar el análisis y obtener un programa en
        // lenguaje Java que imprima en pantalla las iniciales separadas por un espacio. Una letra es inicial
        // de palabra si va precedida de blanco u otro carácter que no sea letra o es la primera de una línea.
        // Téngase en cuenta que las palabras del fichero, están separadas por uno o más espacios en blanco
        // o final de línea. Puedes ayudarte de la clase StringTokenizer
        // La clase StringTokenizer nos ayuda a dividir un string en substrings o tokens, en base a otro string
        // (normalmente un carácter) separador entre ellos denominado delimitador.
        // Por ejemplo:
        // String nombre="Angel Franco García";
        // StringTokenizer tokens=new StringTokenizer(nombre);
        // while(tokens.hasMoreTokens()){
        //  System.out.println(tokens.nextToken());
        // }

        // Preguntamos la ubicacion del archivo al usuario
        System.out.println("Introduzca la ubicación del archivo: ");
        Scanner sc = new Scanner(System.in);
        FileReader ruta = new FileReader(new File (sc.nextLine()));

        // Llamamos al método MostrarIniciales
        System.out.println("Las iniciales del archivo son: ");
        MostrarIniciales(ruta);





    }

    public static void MostrarIniciales(FileReader ruta) throws IOException {
        // Leemos el archivo
        BufferedReader lector = new BufferedReader(ruta);
        String texto = "";
        String line = "";
        while ((line = lector.readLine()) != null) {
            StringTokenizer stText = new StringTokenizer(line);
            while (stText.hasMoreTokens()) {
                texto += stText.nextToken().charAt(0) + " ";
            }
        }        
        // Imprimimos el resultado
        System.out.println(texto);


      
    }
}
