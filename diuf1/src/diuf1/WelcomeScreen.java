package diuf1;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Image;
import java.awt.Font;
import javax.swing.UIManager;


public class WelcomeScreen {

    private JFrame frame;

    /**
     * Lanzamiento de la aplicacion
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WelcomeScreen window = new WelcomeScreen();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Creamos la ventana
     */
    public WelcomeScreen() {
        initialize();
    }

    /**
     * Creamos el contenido de la ventana
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setBounds(100, 100, 450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null); 

        // Botón "Empecemos"
        JButton startButton = new JButton("Empecemos");
        startButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        startButton.setForeground(new Color(0, 0, 0));
        startButton.setBackground(new Color(255, 153, 153));
        startButton.setBounds(147, 500, 128, 30); 
        startButton.addActionListener(e -> {
            LoginScreen loginScreen = new LoginScreen(); // Crear instancia de LoginScreen
            loginScreen.setVisible(true); // Hacer visible la pantalla de login
            frame.dispose(); 
        });
        frame.getContentPane().add(startButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(40, 107, 320, 293);
        frame.getContentPane().add(lblNewLabel);

        // Cargar la imagen original en originalIcon
        ImageIcon originalIcon = new ImageIcon("C:\\DAN\\PROGRAMACION\\desarrollo-interfaces\\diuf1\\src\\images\\comida-rapida.png");
        
        // Escalar la imagen
        Image scaledImage = originalIcon.getImage().getScaledInstance(320, 238, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel
        lblNewLabel.setIcon(new ImageIcon(scaledImage));
        
        Label label = new Label("Welcome");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Impact", Font.BOLD, 74));
        label.setBounds(30, 10, 350, 109);
        frame.getContentPane().add(label);
        
        Label label_1 = new Label("FastEat");
        label_1.setFont(new Font("Impact", Font.PLAIN, 74));
        label_1.setAlignment(Label.CENTER);
        label_1.setBounds(40, 390, 350, 109);
        frame.getContentPane().add(label_1);
    }
}
