package Task3;

import javax.swing.*;
import java.awt.*;

public class Image extends JFrame {

    public Image() {
        setTitle("Приложение с изображениями");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLayout(new GridLayout(2, 2));

        String documentsPath = System.getProperty("user.home") + "/Documents/";

        JPanel panel1 = new JPanel();
        JLabel imageLabel1 = new JLabel(new ImageIcon(documentsPath + "Moscow.jpg"));
        JLabel caption1 = new JLabel("Москва", JLabel.CENTER);
        caption1.setFont(new Font("Arial", Font.BOLD, 16));
        panel1.setLayout(new BorderLayout());
        panel1.add(imageLabel1, BorderLayout.CENTER);
        panel1.add(caption1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        JLabel imageLabel2 = new JLabel(new ImageIcon(documentsPath + "Pyatygorsk.jpg"));
        JLabel caption2 = new JLabel("Пятигорск", JLabel.CENTER);
        caption2.setFont(new Font("Arial", Font.BOLD, 16));
        panel2.setLayout(new BorderLayout());
        panel2.add(imageLabel2, BorderLayout.CENTER);
        panel2.add(caption2, BorderLayout.SOUTH);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Image();
            }
        });
    }
}