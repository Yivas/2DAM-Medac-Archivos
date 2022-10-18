package tema2.ejercicio_evaluable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad_TEMA2 {

	public static void main(String[] args) throws IOException {
		// Inicializamos las variables
		File archivo_anterior = new File(System.getProperty("user.home") +"\\Documents\\Actividad_TEMA 1\\Actividad_File.txt");
		ArrayList<String> lineas = new ArrayList<String>();
		Scanner Scanner_archivo = new Scanner(archivo_anterior);
		File archivo_nuevo = new File(System.getProperty("user.home") +"\\Documents\\Actividad_TEMA 1\\Actividad_TEMA2_extracion.txt");
		archivo_nuevo.createNewFile();
		FileWriter escritura = new FileWriter(archivo_nuevo);
		int contador = 0;
		int parrafo = 1;
		// Contador de lineas
		do  {
			lineas.addAll(Arrays.asList(Scanner_archivo.nextLine().split(" ")));
			if (lineas.get(0).equals("") || Scanner_archivo.hasNextLine() == false) {
				System.out.println("El parrafo "+ parrafo +" tiene "+ contador +" lineas");
				escritura.write("El parrafo "+ parrafo +" tiene "+ contador +" lineas \n");
				parrafo++;
			} else {
				contador++;
			}
			lineas.clear();
		} while (Scanner_archivo.hasNextLine());
		Scanner_archivo.close();
		// Primera palabra de cada linea
		System.out.println("--Primera palabra de cada linea--");
		escritura.write("--Primera palabra de cada linea-- \n");
		Scanner Scanner_archivo2 = new Scanner(archivo_anterior);
		while (Scanner_archivo2.hasNextLine()) {
			lineas.addAll(Arrays.asList(Scanner_archivo2.nextLine().split(" ")));
			System.out.println(lineas.get(0));
			escritura.write(lineas.get(0) + "\n");
			lineas.clear();
		}
		Scanner_archivo2.close();
		// Palabra aleatoria de cada linea
		System.out.println("--Palabra aleatoria de cada linea--");
		escritura.write("--Palabra aleatoria de cada linea-- \n");
		Scanner Scanner_archivo3 = new Scanner(archivo_anterior);
		while (Scanner_archivo3.hasNextLine()) {
			lineas.addAll(Arrays.asList(Scanner_archivo3.nextLine().split(" ")));
			int random = (int) (Math.random() * lineas.size());
			System.out.println(lineas.get(random));
			escritura.write(lineas.get(random) + "\n");
			lineas.clear();
		}
		Scanner_archivo3.close();
		escritura.close();
	}
}
