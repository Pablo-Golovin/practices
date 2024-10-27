package Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JButton swapButton;

    public Panels() {
        setTitle("Приложение с двумя панелями");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(3, 1));

        JPanel panel1 = createPanel("Первая панель", Color.RED, 40);
        JPanel panel2 = createPanel("Вторая панель", Color.BLACK, 30);
        JPanel buttonPanel = createButtonPanel();

        add(panel1);
        add(panel2);
        add(buttonPanel);

        setVisible(true);
    }

    private JPanel createPanel(String text, Color color, int fontSize) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setForeground(color);
        label.setFont(new Font("Calibri", Font.BOLD, fontSize));
        panel.add(label, BorderLayout.CENTER);

        if (text.equals("Первая панель")) {
            label1 = label;
        } else {
            label2 = label;
        }

        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        swapButton = new JButton("Поменять местами");
        swapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = label1.getText();
                label1.setText(label2.getText());
                label2.setText(temp);

                Color tempColor = label1.getForeground();
                label1.setForeground(label2.getForeground());
                label2.setForeground(tempColor);

                int tempSize = label1.getFont().getSize();
                label1.setFont(new Font("Calibri", Font.BOLD, label2.getFont().getSize()));
                label2.setFont(new Font("Calibri", Font.BOLD, tempSize));
            }
        });
        panel.add(swapButton);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Panels();
            }
        });
    }
}