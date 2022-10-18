package ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Actividad1_T1 {
	
	static String ultima_mod = "";

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad1_T1 window = new Actividad1_T1();
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
	public Actividad1_T1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 638, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel titulo_nombre = new JLabel("Nombre:");
		titulo_nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		titulo_nombre.setBounds(10, 34, 137, 14);
		
		JLabel titulo_formato = new JLabel("Formato:");
		titulo_formato.setHorizontalAlignment(SwingConstants.RIGHT);
		titulo_formato.setBounds(10, 59, 137, 14);
		
		JLabel titulo_ruta = new JLabel("Ruta absoluta:");
		titulo_ruta.setHorizontalAlignment(SwingConstants.RIGHT);
		titulo_ruta.setBounds(10, 84, 137, 14);
		
		JLabel titulo_tamaño = new JLabel("Tamaño:");
		titulo_tamaño.setHorizontalAlignment(SwingConstants.RIGHT);
		titulo_tamaño.setBounds(10, 110, 137, 14);
		
		JLabel titulo_modificacion = new JLabel("Última modificación:");
		titulo_modificacion.setHorizontalAlignment(SwingConstants.RIGHT);
		titulo_modificacion.setBounds(10, 135, 137, 14);
		
		
		JLabel texto_nombre = new JLabel("");
		texto_nombre.setHorizontalAlignment(SwingConstants.LEFT);
		texto_nombre.setBounds(157, 34, 391, 14);
		
		JLabel texto_formato = new JLabel("");
		texto_formato.setBounds(157, 59, 391, 14);
		
		JLabel texto_ruta = new JLabel("");
		texto_ruta.setBounds(157, 84, 391, 14);
		
		JLabel texto_tamaño = new JLabel("");
		texto_tamaño.setBounds(157, 110, 391, 14);
		
		JLabel texto_modificacion = new JLabel("");
		texto_modificacion.setBounds(157, 135, 391, 14);
		
		JButton boton_seleccion = new JButton("Buscar archivo");
		boton_seleccion.setBounds(237, 276, 137, 23);
		boton_seleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
                JFileChooser elegir = new JFileChooser ();
                elegir.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	            int opcion = elegir.showOpenDialog(frame);

	            String nombre = elegir.getSelectedFile().getName();
	            String extension = elegir.getTypeDescription(elegir.getSelectedFile());
	            String directorio = elegir.getCurrentDirectory().toString();
	            long tamaño = elegir.getSelectedFile().length();
                FileTime tiempo;
	            Path path = Paths.get(directorio);
                

                try {
					tiempo = Files.getLastModifiedTime(path);
					GetTime(tiempo);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

                if (nombre != null && !extension.equals("File folder")) {
                	texto_nombre.setText(nombre);
                	texto_ruta.setText(directorio);
                	texto_formato.setText(extension);
                	texto_tamaño.setText(Integer.toString((int) tamaño) + " KB");
                    texto_modificacion.setText(ultima_mod);
                } else if (nombre != null && extension.equals("File folder")) {
                	texto_nombre.setText(nombre);
                	texto_ruta.setText(directorio);
                	texto_formato.setText("Carpeta");
                	texto_tamaño.setText(Integer.toString((int) tamaño) + " KB");
                	texto_modificacion.setText(ultima_mod);
                } else {
                    System.out.println("Nada seleccionado");
                }


			}
		});
		
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(boton_seleccion);
		frame.getContentPane().add(titulo_nombre);
		frame.getContentPane().add(titulo_modificacion);
		frame.getContentPane().add(titulo_formato);
		frame.getContentPane().add(titulo_ruta);
		frame.getContentPane().add(titulo_tamaño);
		frame.getContentPane().add(texto_nombre);
		frame.getContentPane().add(texto_formato);
		frame.getContentPane().add(texto_ruta);
		frame.getContentPane().add(texto_tamaño);
		frame.getContentPane().add(texto_modificacion);
		
		
	}

    private static void GetTime(FileTime tiempo) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        ultima_mod = (dateFormat.format(tiempo.toMillis()));
    }


}
