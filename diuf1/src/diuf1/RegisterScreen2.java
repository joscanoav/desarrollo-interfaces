package diuf1;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JSlider;

public class RegisterScreen2 extends JFrame {
    public RegisterScreen2() {
    	getContentPane().setBackground(Color.ORANGE);
        setTitle("FastEat - Register 2");
        setSize(450, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JButton nextButton = new JButton("Siguiente");
        nextButton.setForeground(Color.RED);
        nextButton.setBounds(230, 482, 100, 30); // Ajusta la posición del botón
        nextButton.addActionListener(e -> {
        new RegisterScreen3().setVisible(true); // Abre la siguiente pantalla de registro
            dispose(); // Cierra la pantalla actual
        });
        getContentPane().add(nextButton); // Agrega el botón a la ventana
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(113, 52, 163, 169);
        getContentPane().add(lblNewLabel);
        
        Label label_1 = new Label("FastEat");
        label_1.setFont(new Font("Impact", Font.BOLD, 30));
        label_1.setAlignment(Label.CENTER);
        label_1.setBounds(113, 204, 163, 69);
        getContentPane().add(label_1);
        // Cargar la imagen original en originalIcon
        ImageIcon originalIcon = new ImageIcon("C:\\DAN\\PROGRAMACION\\desarrollo-interfaces\\diuf1\\src\\images\\comida-rapida.png");
        
        // Escalar la imagen
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 138, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel
        lblNewLabel.setIcon(new ImageIcon(scaledImage));
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Hombre", "Mujer", "Indefinido"}));
        comboBox.setBounds(143, 279, 200, 22);
        getContentPane().add(comboBox);
        
        Label label_1_1 = new Label("Genero");
        label_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1.setAlignment(Label.CENTER);
        label_1_1.setBounds(31, 260, 124, 69);
        getContentPane().add(label_1_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto terminos y condiciones");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxNewCheckBox.setBackground(Color.ORANGE);
        chckbxNewCheckBox.setBounds(105, 377, 225, 23);
        getContentPane().add(chckbxNewCheckBox);
        
        JCheckBox chckbxAceptoEnvioDe = new JCheckBox("Acepto envio de promociones");
        chckbxAceptoEnvioDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxAceptoEnvioDe.setBackground(Color.ORANGE);
        chckbxAceptoEnvioDe.setBounds(105, 414, 225, 23);
        getContentPane().add(chckbxAceptoEnvioDe);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setForeground(Color.RED);
        btnCancelar.setBounds(78, 482, 100, 30);
        getContentPane().add(btnCancelar);
        
        Label label_1_1_1 = new Label("Edad");
        label_1_1_1.setFont(new Font("Impact", Font.BOLD, 16));
        label_1_1_1.setAlignment(Label.CENTER);
        label_1_1_1.setBounds(31, 314, 124, 46);
        getContentPane().add(label_1_1_1);
        
        JSlider slider = new JSlider(0, 100);
        slider.setBackground(Color.ORANGE);
        slider.setForeground(Color.ORANGE);
        slider.setBounds(143, 324, 200, 26);
        getContentPane().add(slider);
        
    }
}