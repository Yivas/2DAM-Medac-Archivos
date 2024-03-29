package Interfaz1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;

public class Interfaz1 {

	private JFrame frame;
	private JTextField txtBucar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz1 window = new Interfaz1();
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
	public Interfaz1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 506, Short.MAX_VALUE))
					.addGap(298))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		txtBucar = new JTextField();
		txtBucar.setBounds(40, 0, 357, 25);
		txtBucar.setToolTipText("");
		txtBucar.setColumns(10);
		
		JButton boton_login = new JButton("Login");
		boton_login.setBounds(430, 0, 76, 25);
		boton_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		
		JButton boton_busqueda = new JButton("");
		boton_busqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton_busqueda.setBounds(398, 0, 33, 25);
		panel.add(boton_busqueda);
		panel.add(txtBucar);
		panel.add(boton_login);
		
		JLabel lblIconoDe = new JLabel("Icono de web");
		lblIconoDe.setBounds(0, 0, 40, 25);


		panel.add(lblIconoDe);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 25, 506, 25);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton boton_inicio = new JButton("Inicio");
		boton_inicio.setBounds(0, 0, 89, 23);
		panel_2.add(boton_inicio);
		
		JButton boton_ofertas = new JButton("Ofertas");
		boton_ofertas.setBounds(99, 0, 89, 23);
		panel_2.add(boton_ofertas);
		
		JButton boton_configurador = new JButton("Configurador");
		boton_configurador.setBounds(203, 0, 89, 23);
		panel_2.add(boton_configurador);
		
		JButton boton_terminos = new JButton("Terminos");
		boton_terminos.setBounds(309, 0, 89, 23);
		panel_2.add(boton_terminos);
		
		JButton boton_contacto = new JButton("Contacto");
		boton_contacto.setBounds(417, 0, 89, 23);
		panel_2.add(boton_contacto);
		
		JButton boton_promocion = new JButton("Promocion");
		boton_promocion.setBounds(0, 51, 506, 86);
		panel.add(boton_promocion);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 506, 48);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 54, 506, 82);
		panel_1.setLayout(null);
		panel_3.setLayout(null);
		
		JButton boton_oferta4 = new JButton("oferta");
		boton_oferta4.setBounds(417, 0, 89, 48);
		panel_3.add(boton_oferta4);
		
		JButton boton_oferta3 = new JButton("oferta");
		boton_oferta3.setBounds(281, 0, 89, 48);
		panel_3.add(boton_oferta3);
		
		JButton boton_oferta2 = new JButton("oferta");
		boton_oferta2.setBounds(139, 0, 89, 48);
		panel_3.add(boton_oferta2);
		
		JButton boton_oferta1 = new JButton("oferta");
		boton_oferta1.setBounds(0, 0, 89, 48);
		panel_3.add(boton_oferta1);
		panel_1.add(panel_3);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton boton_producto5 = new JButton("producto");
		boton_producto5.setBounds(407, 10, 89, 60);
		panel_4.add(boton_producto5);
		
		JButton boton_producto4 = new JButton("producto");
		boton_producto4.setBounds(308, 10, 89, 60);
		panel_4.add(boton_producto4);
		
		JButton boton_producto3 = new JButton("producto");
		boton_producto3.setBounds(209, 10, 89, 60);
		panel_4.add(boton_producto3);
		
		JButton boton_producto2 = new JButton("producto");
		boton_producto2.setBounds(110, 10, 89, 60);
		panel_4.add(boton_producto2);
		
		JButton boton_producto1 = new JButton("producto");
		boton_producto1.setBounds(11, 10, 89, 60);
		panel_4.add(boton_producto1);
		frame.getContentPane().setLayout(groupLayout);
	}
}
