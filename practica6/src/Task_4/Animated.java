package Task_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Animated extends JFrame {
    private JLabel imageLabel;
    private ImageIcon[] frames;
    private int currentFrame = 0;

    public Animated() {
        setTitle("Animated Image");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        frames = new ImageIcon[10];

        frames[0] = new ImageIcon("/Users/user/Downloads/kp1.jpg");
        frames[1] = new ImageIcon("/Users/user/Downloads/kp2.jpg");
        frames[2] = new ImageIcon("/Users/user/Downloads/kp3.jpg");
        frames[3] = new ImageIcon("/Users/user/Downloads/kp4.jpg");
        frames[4] = new ImageIcon("/Users/user/Downloads/kp5.jpg");
        frames[5] = new ImageIcon("/Users/user/Downloads/kp6.jpg");
        frames[6] = new ImageIcon("/Users/user/Downloads/kp7.jpg");
        frames[7] = new ImageIcon("/Users/user/Downloads/kp8.jpg");
        frames[8] = new ImageIcon("/Users/user/Downloads/kp9.jpg");
        frames[9] = new ImageIcon("/Users/user/Downloads/kp10.jpg");

        for (ImageIcon frame : frames) {
            if (frame.getIconWidth() == -1) {
                System.err.println("Image not found: " + frame.getDescription());
            }
        }

        imageLabel = new JLabel(frames[currentFrame]);
        add(imageLabel);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                imageLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Animated frame = new Animated();
            frame.setVisible(true);
        });
    }
}