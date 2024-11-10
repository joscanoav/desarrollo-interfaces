package diuf1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RegisterScreen1 extends JFrame {
    public RegisterScreen1() {
        setTitle("FastEat - Register 1");
        setSize(450, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JButton nextButton = new JButton("Siguiente");
        nextButton.setBounds(150, 500, 100, 30);
        nextButton.addActionListener(e -> {
        new RegisterScreen2().setVisible(true); // Abre la siguiente pantalla de registro
            dispose(); // Cierra la pantalla actual
        });
        add(nextButton);
    }
}