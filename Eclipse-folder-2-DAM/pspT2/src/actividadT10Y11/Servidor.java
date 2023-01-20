package actividadT10Y11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	private static final int PUERTO = 7000;

	public static void main(String[] args) {
		try {
			// Creo el pocket que escucha con el puerto 7000
			ServerSocket skServidor = new ServerSocket(PUERTO);
			System.out.println("Escuchando en el puerto " + PUERTO);

			while (true) {
				// Escuchando a cliente
				Socket skCliente = skServidor.accept();
				System.out.println("Cliente conectado");

				// Creamos flujos de entrada y salida
				DataInputStream flujoEntrada = new DataInputStream(skCliente.getInputStream());
				DataOutputStream flujoSalida = new DataOutputStream(skCliente.getOutputStream());

				// Le enviamos un mensaje al cliente para que sepa que se ha conectado
				flujoSalida.writeUTF("Conectado al servidor");

				// Crea hilos para atender a los clientes
				ServidorHilos hilo = new ServidorHilos(skCliente, flujoEntrada, flujoSalida);
				hilo.start();
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
