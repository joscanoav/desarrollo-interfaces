package diuf1;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JRadioButton;

public class RegisterScreen3 extends JFrame {
    public RegisterScreen3() {
    	getContentPane().setBackground(Color.ORANGE);
        setTitle("FastEat - Register 3");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JButton registerButton = new JButton("Registrar");
        registerButton.setForeground(Color.RED);
        registerButton.setBounds(223, 488, 100, 30);
        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Registro completado");
            System.exit(0); // Cierra el programa
        });
        getContentPane().add(registerButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(105, 45, 163, 169);
        getContentPane().add(lblNewLabel);
        
        Label label_1 = new Label("FastEat");
        label_1.setFont(new Font("Impact", Font.BOLD, 30));
        label_1.setAlignment(Label.CENTER);
        label_1.setBounds(105, 197, 163, 69);
        getContentPane().add(label_1);
        // Cargar la imagen original en originalIcon
        ImageIcon originalIcon = new ImageIcon("C:\\DAN\\PROGRAMACION\\desarrollo-interfaces\\diuf1\\src\\images\\comida-rapida.png");
        
        // Escalar la imagen
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 138, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel
        lblNewLabel.setIcon(new ImageIcon(scaledImage));
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Gratis");
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnNewRadioButton.setBackground(Color.ORANGE);
        rdbtnNewRadioButton.setBounds(105, 328, 163, 35);
        getContentPane().add(rdbtnNewRadioButton);
        
        Label label_1_1 = new Label("Selecciona Plan Socio");
        label_1_1.setFont(new Font("Impact", Font.BOLD, 20));
        label_1_1.setAlignment(Label.CENTER);
        label_1_1.setBounds(35, 256, 310, 69);
        getContentPane().add(label_1_1);
        
        JRadioButton rdbtnSocioA = new JRadioButton("Socio a € 10 / mes");
        rdbtnSocioA.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnSocioA.setBackground(Color.ORANGE);
        rdbtnSocioA.setBounds(105, 366, 163, 35);
        getContentPane().add(rdbtnSocioA);
        
        JRadioButton rdbtnSocioPremiumA = new JRadioButton("Socio Premium a € 20/ mes");
        rdbtnSocioPremiumA.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnSocioPremiumA.setBackground(Color.ORANGE);
        rdbtnSocioPremiumA.setBounds(105, 414, 218, 35);
        getContentPane().add(rdbtnSocioPremiumA);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setForeground(Color.RED);
        btnCancelar.setBounds(64, 488, 100, 30);
        getContentPane().add(btnCancelar);
    }
}
