package actividad14;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escribe el texto del cual crear un hash SHA-256");
		// Preguntamos al usuario la cadena de texto
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
        try {
            // Crear instancia de MessageDigest para SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Calcular el resumen para la cadena de texto
            byte[] hash = digest.digest(texto.getBytes(StandardCharsets.UTF_8));
            
            // Convertir el resumen en una cadena hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            
            // Imprimir el resumen
            System.out.println("Resumen SHA-256 para \"" + texto + "\":");
            System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

	}

}
