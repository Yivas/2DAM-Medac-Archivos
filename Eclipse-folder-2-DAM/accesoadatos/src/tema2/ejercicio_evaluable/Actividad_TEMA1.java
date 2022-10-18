package tema2.ejercicio_evaluable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Actividad_TEMA1 {

	public static void main(String[] args) {
		// Creacion de carpeta
        File carpeta = new File(System.getProperty("user.home") +"\\Documents\\Actividad_TEMA 1");
        carpeta.mkdir();
        // Creacion de archivo
        File archivo = new File(System.getProperty("user.home") +"\\Documents\\Actividad_TEMA 1\\Actividad_File.txt");
        try {
			archivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
        // Añadir texto al archivo
        String Texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme,\r\n"
        		+ "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,\r\n"
        		+ "adarga antigua, rocín flaco y galgo corredor.\r\n"
        		+ "Una olla de algo más vaca que carnero, salpicón las más noches,\n"
        		+ "duelos y quebrantos los sábados, lentejas los viernes,\r\n"
        		+ "algún palomino de añadidura los domingos,\r\n"
        		+ "consumían las tres partes de su hacienda.\r\n"
        		+ "El resto della concluían sayo de velarte,\r\n"
        		+ "calzas de velludo para las fiestas con sus pantuflos de lo mismo,\r\n"
        		+ "los días de entre semana se honraba con su vellori de lo más fino.\r\n"
        		+ "\r\n"
        		+ "Tenía en su casa una ama que pasaba de los cuarenta,\r\n"
        		+ "y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza,\r\n"
        		+ "que así ensillaba el rocín como tomaba la podadera.\r\n"
        		+ "Frisaba la edad de nuestro hidalgo con los cincuenta años,\r\n"
        		+ "era de complexión recia, seco de carnes, enjuto de rostro;\r\n"
        		+ "gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada o Quesada\r\n"
        		+ "(que en esto hay alguna diferencia en los autores que deste caso escriben),\r\n"
        		+ "aunque por conjeturas verosímiles se deja entender que se llama Quijana;\r\n"
        		+ "pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga un punto de la verdad.";
        try {
			FileWriter escritura = new FileWriter(archivo);
			escritura.write(Texto);
			escritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        // Atributos del archivo
        String nombre = archivo.getName();
        String extension = nombre.substring(nombre.lastIndexOf("."));
	    String Ruta = archivo.getPath();
	    long tamaño = archivo.length();
        System.out.println("Nombre: " + nombre);
        System.out.println("Extension: " + extension);
        System.out.println("Ruta: " + Ruta);
        System.out.println("Tamaño: " + tamaño + " bytes");
        // Cantidad de lineas del archivo
        try {
        	long lineas = Files.lines(Paths.get(Ruta)).count();
        	System.out.println("Lineas: " + lineas);
        } catch (IOException e) {
        	e.printStackTrace();
        }
	}
}
