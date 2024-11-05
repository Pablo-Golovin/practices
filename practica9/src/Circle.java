public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public static Circle findLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null;
        }

        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.getArea() > largest.getArea()) {
                largest = circle;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(3.5),
                new Circle(2.8),
                new Circle(4.2),
                new Circle(1.9),
                new Circle(5.1)
        };

        Circle largestCircle = findLargestCircle(circles);

        System.out.println("Информация о кругах:");
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Круг %d: радиус = %.2f, площадь = %.2f%n",
                    i + 1, circles[i].getRadius(), circles[i].getArea());
        }

        if (largestCircle != null) {
            System.out.printf("%nКруг с самой большой площадью имеет радиус %.2f и площадь %.2f%n",
                    largestCircle.getRadius(), largestCircle.getArea());
        } else {
            System.out.println("Массив кругов пуст.");
        }
    }
}
