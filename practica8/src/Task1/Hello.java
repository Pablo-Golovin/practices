package Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello extends JFrame {

    private JLabel label;

    public Hello() {
        setTitle("Привет МИР!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        label = new JLabel("Привет МИР!", JLabel.CENTER);
        panel.add(label);

        JButton button = new JButton("Изменить текст");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Мир приветствует тебя!");
            }
        });
        panel.add(button);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hello();
            }
        });
    }
}