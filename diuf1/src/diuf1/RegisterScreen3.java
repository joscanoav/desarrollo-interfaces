package diuf1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterScreen3 extends JFrame {
    public RegisterScreen3() {
        setTitle("FastEat - Register 3");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(150, 500, 100, 30);
        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Registro completado");
            System.exit(0); // Cierra el programa
        });
        add(registerButton);
    }
}
