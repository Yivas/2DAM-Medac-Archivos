package tema3;

import java.io.IOException;

public class ejercicio2 {

	public static void main(String[] args) {
		
		
		try {
			//If que ejecuta el archivo chrome.exe y si no hay error dice "Chrome se ha abierto"
			if (Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe") != null) {
				System.out.println("Chrome se ha abierto");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
