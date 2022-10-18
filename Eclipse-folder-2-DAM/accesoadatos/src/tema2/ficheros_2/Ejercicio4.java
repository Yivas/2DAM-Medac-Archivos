package tema2.ficheros_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {
        // Realizar un programa en Java que cuente las haches intercaladas de un texto de varias líneas
        // que se encuentra en un fichero. Repetir el problema de forma que cuente sólo las palabras con
        // hache intercalada. En este segundo caso una palabra con varias haches intercaladas debe ser
        // contada una sola vez.
        // NOTA: No son hache intercalada las que son comienzo de palabra ni las que aparecen formando
        // 'ch'

        // Preguntamos la ubicacion del archivo al usuario
        System.out.println("Introduzca la ubicación del archivo: ");
        Scanner sc = new Scanner(System.in);
        FileReader ruta = new FileReader(new File (sc.nextLine()));


        // Llamamos al método ContarHaches1
        System.out.println("El número de haches intercaladas es en el caso 1: " + ContarHaches1(ruta));

        // Llamamos al método ContarHaches2
        System.out.println("El número de haches intercaladas es en el caso 2: " + ContarHaches2(ruta));

    }



    public static int ContarHaches1(FileReader ruta) throws IOException {
        // Leer cuantas haches intercaladas hay en el archivo contando multiples por palabra
        // Leemos el archivo palabra por palabra
        BufferedReader lector = new BufferedReader(ruta);
        int haches = 0;
        String palabra = "";
        while (palabra != null) {
            try {
                palabra = lector.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (palabra != null) {
                if (palabra.contains("h")) {
                    if (palabra.contains("ch")) {
                        // No es hache intercalada
                    } else {
                        // Es hache intercalada
                        if (palabra.indexOf("h") == 0) {
                            // No es hache intercalada
                        } else {
                            // Comprobamos cuantas haches intercaladas hay en la palabra
                            for (int i = 0; i < palabra.length(); i++) {
                                if (palabra.charAt(i) == 'h') {
                                    haches++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return haches;
    }

    public static int ContarHaches2(FileReader ruta) throws IOException {
        // Leer cuantas haches intercaladas hay en el archivo contando una sola por palabra
        // Leemos el archivo palabra por palabra
        BufferedReader lector2 = new BufferedReader(ruta);
        int haches = 0;
        String palabra2 = "";
        while (palabra2 != null) {
            try {
                palabra2 = lector2.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (palabra2 != null) {
                if (palabra2.contains("h")) {
                    if (palabra2.contains("ch")) {
                        // No es hache intercalada
                    } else {
                        // Es hache intercalada
                        if (palabra2.indexOf("h") == 0) {
                            // No es hache intercalada
                        } else {
                            // Es hache intercalada
                            haches++;
                        }
                    }
                }
            }
        }


        
        return haches;
    }


}
