package tema6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Actividad6 {

    private JFrame frame;
    private JTextField textField_inicial;
    private JTextField textField_final;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Actividad6 window = new Actividad6();
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
    public Actividad6() {
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
        
        JLabel lbl_texto_titulo = new JLabel("Conversor");
        lbl_texto_titulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_texto_titulo.setBounds(64, 23, 294, 14);
        frame.getContentPane().add(lbl_texto_titulo);
        
        textField_inicial = new JTextField();
        textField_inicial.setBounds(64, 93, 111, 20);
        frame.getContentPane().add(textField_inicial);
        textField_inicial.setColumns(10);
        
        textField_final = new JTextField();
        textField_final.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField_final.setHorizontalAlignment(SwingConstants.LEFT);
        textField_final.setEditable(false);
        textField_final.setBounds(239, 93, 185, 41);
        frame.getContentPane().add(textField_final);
        textField_final.setColumns(10);
        
        JComboBox comboBox_selector_tipo = new JComboBox();
        comboBox_selector_tipo.setModel(new DefaultComboBoxModel(new String[] {"Binario", "Octal","Hexadecimal"}));
        comboBox_selector_tipo.setBounds(64, 124, 111, 22);
        frame.getContentPane().add(comboBox_selector_tipo);
        
        JLabel lbl_resultado = new JLabel("Resultado:");
        lbl_resultado.setBounds(239, 68, 185, 14);
        frame.getContentPane().add(lbl_resultado);
        
        JButton btn_convertir = new JButton("Convertir");
        btn_convertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Comprobamos que el campo textField_inicial no esté vacío
                if (!textField_inicial.getText().isEmpty()) {
                    // Comprobamos que el campo textField_inicial sea un número
                    if (esNumero(textField_inicial.getText())) {
                        // Dependiendo del valor de comboBox_selector_tipo, convertimos el número
                        // y lo mostramos en textField_final
                        switch (comboBox_selector_tipo.getSelectedItem().toString()) {
                            case "Binario":
                                textField_final.setText(convertirBinario(textField_inicial.getText()));
                                break;
                            case "Octal":
                                textField_final.setText(convertirOctal(textField_inicial.getText()));
                                break;
                            case "Hexadecimal":
                                textField_final.setText(convertirHexadecimal(textField_inicial.getText()));
                                break;
                        }
                    }
                }


            }
        });
        btn_convertir.setBounds(166, 176, 89, 23);
        frame.getContentPane().add(btn_convertir);
        
        JLabel lbl_a_convertir = new JLabel("A convertir:");
        lbl_a_convertir.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl_a_convertir.setBounds(64, 68, 111, 14);
        frame.getContentPane().add(lbl_a_convertir);
    }
    
    public String convertirBinario(String entrada) {
        // Convertimos la cadena a binario y la devolvemos como cadena
        return Integer.toBinaryString(Integer.parseInt(entrada));
    }    

    public String convertirOctal(String entrada) {
        // Convertimos la cadena a octal y la devolvemos como cadena
        return Integer.toOctalString(Integer.parseInt(entrada));
    }

    public String convertirHexadecimal(String entrada) {
        // Convertimos la cadena a hexadecimal y la devolvemos como cadena
        return Integer.toHexString(Integer.parseInt(entrada));
    }

    public boolean esNumero(String entrada) {
        // Comprobamos si la cadena es un número
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    
    
    
    
}
