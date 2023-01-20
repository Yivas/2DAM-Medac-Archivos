package actividadT10Y11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	private static final String HOST = "localhost";
	private static final int PUERTO = 7000;

	public static void main(String[] args) {
		try {
			// Creo el socked cliente
			Socket skCliente = new Socket(HOST, PUERTO);

			// Creamos flujos de entrada y salida
			DataInputStream flujoEntrada = new DataInputStream(skCliente.getInputStream());
			DataOutputStream flujoSalida = new DataOutputStream(skCliente.getOutputStream());

			// Recibimos el mensaje del servidor
			System.out.println(flujoEntrada.readUTF());
			Scanner sc = new Scanner(System.in);

			// Creamos un bucle para que el cliente pueda enviar mensajes al servidor
			// y recibir respuestas a travez del temrinal preguntando al usuario
			// y mostrando las respuestas del servidor hasta que el cliente reciba el
			// mensaje
			// "terminarJuego" del servidor
			String mensajeRecivido = "";
			while (mensajeRecivido != "terminarJuego") {
				// Esperamos mensajes del servidor con un bucle hasta que reciba el mensaje
				// "responderCliente"
				while (!mensajeRecivido.equals("responderCliente") || !mensajeRecivido.equals("terminarJuego")) {
					mensajeRecivido = flujoEntrada.readUTF();
					if (!mensajeRecivido.equals("responderCliente") && !mensajeRecivido.equals("terminarJuego")) {
						System.out.println(mensajeRecivido);
					}

					if (mensajeRecivido.equals("responderCliente") && !mensajeRecivido.equals("terminarJuego")) {
						flujoSalida.writeUTF(sc.nextLine());
					}
				}

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
