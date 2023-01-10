package ejercicio_sockets_ddr_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {
        
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al servidor
            out.writeUTF("¡Hola mundo desde el cliente!");

            //Recibo un mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
