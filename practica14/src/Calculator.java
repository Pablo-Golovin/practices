import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JTextField num1Field = new JTextField(10);
    JTextField num2Field = new JTextField(10);
    JTextField resultField = new JTextField(10);
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("/");

    public Calculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 200);

        add(new JLabel("Первое число:"));
        add(num1Field);
        add(new JLabel("Второе число:"));
        add(num2Field);
        add(new JLabel("Результат:"));
        add(resultField);
        resultField.setEditable(false);

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        addButton.addActionListener(new OperationListener('+'));
        subtractButton.addActionListener(new OperationListener('-'));
        multiplyButton.addActionListener(new OperationListener('*'));
        divideButton.addActionListener(new OperationListener('/'));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class OperationListener implements ActionListener {
        private char operation;

        public OperationListener(char operation) {
            this.operation = operation;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(num1Field.getText().trim());
                double num2 = Double.parseDouble(num2Field.getText().trim());
                double result = 0;

                switch(operation) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Деление на ноль!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                }

                resultField.setText(String.valueOf(result));
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ошибка в числах!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}