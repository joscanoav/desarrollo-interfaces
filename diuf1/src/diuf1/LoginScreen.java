package diuf1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class LoginScreen {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;

    public LoginScreen() {
        initialize();
    }

    /**
     * Iniciamos la aplicacion
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setBounds(100, 100, 450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null); 


        // Botón "Registrarse"
        JButton registerButton = new JButton("Registrarse");
        registerButton.setForeground(Color.RED);
        registerButton.setBounds(85, 429, 100, 30); 
        registerButton.addActionListener(e -> {
        RegisterScreen1 registerScreen1 = new RegisterScreen1(); 
        registerScreen1.setVisible(true); 
            frame.dispose(); 
        });
        frame.getContentPane().add(registerButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(138, 0, 163, 169);
        frame.getContentPane().add(lblNewLabel);

        // Cargar la imagen original en originalIcon
        ImageIcon originalIcon = new ImageIcon("C:\\DAN\\PROGRAMACION\\desarrollo-interfaces\\diuf1\\src\\images\\comida-rapida.png");
        
        // Escalar la imagen
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 138, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel
        lblNewLabel.setIcon(new ImageIcon(scaledImage));
        
        Label label_1 = new Label("FastEat");
        label_1.setFont(new Font("Impact", Font.BOLD, 30));
        label_1.setAlignment(Label.CENTER);
        label_1.setBounds(127, 159, 163, 69);
        frame.getContentPane().add(label_1);
        
        Label label_1_1 = new Label("Correo");
        label_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1.setAlignment(Label.CENTER);
        label_1_1.setBounds(38, 237, 124, 69);
        frame.getContentPane().add(label_1_1);
        
        textField = new JTextField();
        textField.setBounds(178, 260, 156, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(178, 309, 156, 20);
        frame.getContentPane().add(textField_1);
        
        Label label_1_1_1 = new Label("Contraseña");
        label_1_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1_1.setAlignment(Label.CENTER);
        label_1_1_1.setBounds(38, 286, 124, 69);
        frame.getContentPane().add(label_1_1_1);
        
        JButton btnNewButton = new JButton("Ingresar");
        btnNewButton.setForeground(Color.RED);
        btnNewButton.setBounds(245, 428, 89, 30);
        btnNewButton.addActionListener(e -> {
            // Mostrar mensaje de ingreso exitoso
            JOptionPane.showMessageDialog(frame, "Ingreso exitoso", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
            // Cerrar el programa
            System.exit(0);
        });
        frame.getContentPane().add(btnNewButton);
    }

    /**
     * Método para mostrar la ventana.
     */
    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
