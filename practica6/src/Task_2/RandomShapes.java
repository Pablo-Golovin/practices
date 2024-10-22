package Task_2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapes extends JPanel {

    private List<Shape> shapes;

    public RandomShapes() {
        shapes = new ArrayList<>();
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(600);
            int y = random.nextInt(600);
            if (random.nextInt(3) == 0) {
                int radius = random.nextInt(50) + 20;
                shapes.add(new Circle(color, x, y, radius));
            } else if (random.nextInt(3) == 1) {
                int width = random.nextInt(80) + 30;
                int height = random.nextInt(80) + 30;
                shapes.add(new Rectangle(color, x, y, width, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (Shape shape : shapes) {
            shape.draw(g2d);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colorful Random Shapes");
        RandomShapes panel = new RandomShapes();

        frame.add(panel);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}