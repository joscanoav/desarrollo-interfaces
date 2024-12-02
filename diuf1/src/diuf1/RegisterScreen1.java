package diuf1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;

public class RegisterScreen1 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
    public RegisterScreen1() {
    	getContentPane().setBackground(Color.ORANGE);
        setTitle("FastEat - Register 1");
        setSize(450, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JButton nextButton = new JButton("Siguiente");
        nextButton.setForeground(Color.RED);
        nextButton.setBounds(237, 487, 100, 30);
        nextButton.addActionListener(e -> {
        new RegisterScreen2().setVisible(true); // Abre la siguiente pantalla de registro
            dispose(); // Cierra la pantalla actual
        });
        getContentPane().add(nextButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(134, 26, 163, 169);
        getContentPane().add(lblNewLabel);
        
        // Cargar la imagen original en originalIcon
        ImageIcon originalIcon = new ImageIcon("C:\\DAN\\PROGRAMACION\\desarrollo-interfaces\\diuf1\\src\\images\\comida-rapida.png");
        
        // Escalar la imagen
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 138, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel
        lblNewLabel.setIcon(new ImageIcon(scaledImage));
        
        Label label_1_1 = new Label("Nombre");
        label_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1.setAlignment(Label.CENTER);
        label_1_1.setBounds(48, 229, 124, 69);
        getContentPane().add(label_1_1);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(188, 252, 156, 20);
        getContentPane().add(textField);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(188, 301, 156, 20);
        getContentPane().add(textField_1);
        
        Label label_1_1_1 = new Label("Correo");
        label_1_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1_1.setAlignment(Label.CENTER);
        label_1_1_1.setBounds(48, 278, 124, 69);
        getContentPane().add(label_1_1_1);
        
        Label label_1_1_2 = new Label("Contraseña");
        label_1_1_2.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1_2.setAlignment(Label.CENTER);
        label_1_1_2.setBounds(48, 326, 124, 69);
        getContentPane().add(label_1_1_2);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(188, 349, 156, 20);
        getContentPane().add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(188, 398, 156, 20);
        getContentPane().add(textField_3);
        
        Label label_1_1_1_1 = new Label("Telefono");
        label_1_1_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1_1_1.setAlignment(Label.CENTER);
        label_1_1_1_1.setBounds(48, 375, 124, 69);
        getContentPane().add(label_1_1_1_1);
        
        Label label_1 = new Label("FastEat");
        label_1.setFont(new Font("Impact", Font.BOLD, 30));
        label_1.setAlignment(Label.CENTER);
        label_1.setBounds(134, 178, 163, 69);
        getContentPane().add(label_1);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setForeground(Color.RED);
        btnCancelar.setBounds(83, 487, 89, 30);
        getContentPane().add(btnCancelar);
    }
}
