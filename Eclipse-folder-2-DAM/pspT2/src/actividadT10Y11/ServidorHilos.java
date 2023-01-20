package actividadT10Y11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServidorHilos extends Thread {

	// Creo variables

	private DataInputStream entrada;
	private DataOutputStream salida;
	private Socket socketCliente;
	String mensajeRecivido = "";

	// Constructor
	public ServidorHilos(Socket socketCliente, DataInputStream entrada, DataOutputStream salida) {
		this.socketCliente = socketCliente;
		this.entrada = entrada;
		this.salida = salida;

	}

	// Codigo del hilo
	@Override
	public void run() {
		boolean repetirBucle = true;
		try {
			
			while (repetirBucle) {
				// Pregunto al cliente si esta listo para jugar o quiere salir del juego
				salida.writeUTF("SERVIDOR: ¿Estas listo para jugar?\n\tSi.\n\tNo.\n\tSalir.\n\t(Esperando petición del cliente...)");

				// Recibo la respuesta del cliente
				salida.writeUTF("responderCliente");
				mensajeRecivido = entrada.readUTF();

				// Comprobamos la respuesta
				switch (mensajeRecivido) {
					case "Si":
						// Si el cliente quiere jugar
						System.out.println("SERVIDOR: El cliente " + this.socketCliente + " envía si...");
						salida.writeUTF("Juego iniciado");
						System.out.println("SERVIDOR: Iniciando juego...");
						juegoDados();
						break;

					case "No":
						// Si el cliente no quiere jugar
						salida.writeUTF("A H, vale avisa en cuanto estes listo.");
						System.out.println("SERVIDOR: El cliente " + this.socketCliente + " envía no...");
						break;

					case "Salir":
						// Si el cliente quiere salir del juego
						salida.writeUTF("Hasta luego, vuelve pronto.");
						salida.writeUTF("terminarJuego");
						System.out.println("SERVIDOR: El cliente " + this.socketCliente + " envía salir...");
						System.out.println("SERVIDOR: Cerrando la conexión...");
						this.socketCliente.close();
						System.out.println("SERVIDOR: Conexión cerrada.");
						repetirBucle = false;
						break;

					default:
						// Si el cliente no envia una respuesta correcta
						salida.writeUTF("Respuesta incorrecta");
						System.out.println(
								"SERVIDOR: El cliente " + this.socketCliente + " envía una respuesta incorrecta...");
						break;

				}
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// Metodo del juego de dados
	public void juegoDados() {
		int dadoCliente;
		// Genero numero aleatorio del dado del servidor
		int dadoServidor = (int) (Math.random() * 6) + 1;
		// Mostrar el numero del dado del servidor en la consola
		System.out.println("SERVIDOR: El número del dado del servidor es " + dadoServidor);

		// Indicamos al usuario si realiza la tirada (solo se permite si)
		try {
			salida.writeUTF(
					"SERVIDOR: ¿Quieres realizar la tirada?\n\tSi.\n\tNo.\n\t(Esperando petición del cliente...)");
			// Recibo la respuesta del cliente
			salida.writeUTF("responderCliente");
			mensajeRecivido = entrada.readUTF();

			// Comprobamos la respuesta del cliente
			boolean repetirBucle = true;
			while (repetirBucle) {
				switch (mensajeRecivido) {
				case "Si":
					System.out.println("SERVIDOR: El cliente " + this.socketCliente + " envía si...");
					// Genero numero aleatorio del dado del cliente
					dadoCliente = (int) (Math.random() * 6) + 1;
					// Mostrar el numero del dado del cliente en la consola
					System.out.println("SERVIDOR: El número del dado del cliente es " + dadoCliente);
					// Comprobamos quien ha ganado
					if (dadoCliente > dadoServidor) {
						System.out.println("SERVIDOR: El cliente " + this.socketCliente + " ha ganado.");
                        salida.writeUTF("SERVIDOR: Tu número es " + dadoCliente + " y el del servidor es " + dadoServidor + ".");
						salida.writeUTF("SERVIDOR: Has ganado.");
					} else if (dadoCliente < dadoServidor) {
						System.out.println("SERVIDOR: El cliente " + this.socketCliente + " ha perdido.");
                        salida.writeUTF("SERVIDOR: Tu número es " + dadoCliente + " y el del servidor es " + dadoServidor + ".");
						salida.writeUTF("SERVIDOR: Has perdido.");
					} else {
						System.out.println("SERVIDOR: El cliente " + this.socketCliente + " ha empatado.");
                        salida.writeUTF("SERVIDOR: Tu número es " + dadoCliente + " y el del servidor es " + dadoServidor + ".");
						salida.writeUTF("SERVIDOR: Has empatado.");
					}
					repetirBucle = false;
					break;

				case "No":
					// Indicamos al usuario que ha perdido
					System.out.println("SERVIDOR: El cliente " + this.socketCliente + " envía no...");
					salida.writeUTF("SERVIDOR: Has perdido por no realizar una tirada.");
					repetirBucle = false;
					break;

				default:
					// Indicamos al usuario que ha perdido
					System.out.println(
							"SERVIDOR: El cliente " + this.socketCliente + " envía una respuesta incorrecta...");
					salida.writeUTF("SERVIDOR: Respuesta incorrecta.");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
