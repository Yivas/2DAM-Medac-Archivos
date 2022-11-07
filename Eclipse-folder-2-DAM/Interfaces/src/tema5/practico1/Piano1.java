package tema5.practico1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfugue.player.Player;
public class Piano1 extends JFrame {
    private JPanel contentPane;
    public Player player = new Player();
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Piano1 frame = new Piano1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Piano1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 549, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton A = new JButton("DO");
        A.setBounds(28, 11, 60, 239);
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("C");
            }
        });
        contentPane.add(A);
        
        JButton B = new JButton("RE");
        B.setBounds(98, 11, 60, 239);
        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("D");
            }
        });
        contentPane.add(B);
        
        JButton C = new JButton("MI");
        C.setBounds(168, 11, 60, 239);
        C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("E");
            }
        });
        contentPane.add(C);
        
        JButton D = new JButton("FA");
        D.setBounds(238, 11, 60, 239);
        D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("F");
            }
        });
        contentPane.add(D);
        
        JButton E = new JButton("SOL");
        E.setBounds(308, 11, 60, 239);
        E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("G");
            }
        });
        contentPane.add(E);
        
        JButton F = new JButton("LA");
        F.setBounds(378, 11, 60, 239);
        F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("A");
            }
        });
        contentPane.add(F);
        
        JButton G = new JButton("SI");
        G.setBounds(448, 11, 60, 239);
        G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player.play("B");
            }
        });
        contentPane.add(G);

    }
}