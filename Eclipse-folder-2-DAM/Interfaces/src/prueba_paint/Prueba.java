package prueba_paint;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prueba{

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Prueba window = new Prueba();
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
    public Prueba() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyPanel());
        frame.pack();

    }

    @SuppressWarnings("serial")
    class MyPanel extends JPanel {
    
        public Dimension getPreferredSize() {
            return new Dimension(320, 240);
        }
    
        public void paint(Graphics g){
            super.paint(g);
            Toolkit t=Toolkit.getDefaultToolkit();
            int ancho=(int)(t.getScreenSize().getWidth());
            int alt=(int)(t.getScreenSize().getHeight());
            Image i = t.getImage("src//img//fondo_hall.png");
            g.drawImage(i, 0, 0, ancho, alt, this);
        }
    }
}