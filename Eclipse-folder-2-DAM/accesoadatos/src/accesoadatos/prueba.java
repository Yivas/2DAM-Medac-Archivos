package accesoadatos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton boton_crear = new JButton("crear");
		boton_crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File fichero = new File("C:\\Users\\Usuario\\Documents\\Accesoadatos\\Prueba\\prueba.txt");
					fichero.createNewFile();
				} catch (IOException e1) {
					System.out.println("Error al crear archivo");
				}
				
			}
		});
		boton_crear.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(boton_crear);
		
		JButton boton_mover = new JButton("mover");
		boton_mover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File fileOrigen = new File("C:\\Users\\Usuario\\Documents\\Accesoadatos\\Prueba\\prueba.txt");
				File fileDestino = new File("C:\\Users\\Usuario\\Documents\\Accesoadatos\\Prueba\\movido\\prueba.txt");
				if (fileOrigen.renameTo(fileDestino)) {
					System.out.println("El fichero se movio");
				} else {
					System.out.println("El fichero no se movio");
				}
			}
		});
		boton_mover.setBounds(109, 11, 89, 23);
		frame.getContentPane().add(boton_mover);
		
		JButton boton_escribir = new JButton("escribir");
		boton_escribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String path = "C:\\Users\\Usuario\\Documents\\Accesoadatos\\Prueba\\prueba.txt";
				String cadena = "Esto es texto";
				byte[] arrayBytes = cadena.getBytes();
				
				
				FileOutputStream output;
				try {
					output = new FileOutputStream(path);
					output.write(arrayBytes);
					output.close();
					System.out.println("Fichero escrito.");
				} catch (IOException e1) {
					System.out.println("Error de escritura");
				}
				
				
				
			}
		});
		boton_escribir.setBounds(208, 11, 89, 23);
		frame.getContentPane().add(boton_escribir);
		
		JButton boton_leer = new JButton("leer");
		boton_leer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int bufferSize = 4 * 1024;
					BufferedInputStream bufferedInputStream = new BufferedInputStream(
							new FileInputStream("C:\\Users\\Usuario\\Documents\\Accesoadatos\\Prueba\\prueba.txt"),
							bufferSize);
					int info = bufferedInputStream.read();
					while (info != -1) {
						System.out.println(bufferedInputStream.read());
						info = bufferedInputStream.read();
					}
					bufferedInputStream.close();
					
				} catch (IOException e1) {
					System.out.println("Error de lectura");
				}
				
				
			}
		});
		boton_leer.setBounds(307, 11, 89, 23);
		frame.getContentPane().add(boton_leer);
	}
}
