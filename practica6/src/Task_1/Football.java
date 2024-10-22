package Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame implements ActionListener {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;
    public Football() {
        setTitle("European Football Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 1200);
        setLayout(new GridLayout(3, 2));
        JButton milanButton = new JButton("AC Milan");
        milanButton.setForeground(Color.BLACK);
        milanButton.addActionListener(this);
        add(milanButton);
        JButton madridButton = new JButton("Real Madrid");
        madridButton.setForeground(Color.WHITE);
        madridButton.addActionListener(this);
        add(madridButton);
        resultLabel = new JLabel("Result: " + milanScore + " - " + madridScore);
        add(resultLabel);
        lastScorerLabel = new JLabel("Last Scorer: None");
        add(lastScorerLabel);
        winnerLabel = new JLabel("Winner: TBD");
        add(winnerLabel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AC Milan")) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        }else if (e.getActionCommand().equals("Real Madrid")) {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        resultLabel.setText("Result: " + milanScore + " - " + madridScore);
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: TBD");
        }
    }

    public static void main(String[] args) {
        new Football();    }
}