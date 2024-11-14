public class TestGeometricObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4.2);
        Circle circle2 = new Circle(6.8);

        GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Наибольший круг: " + largestCircle);

        Rectangle rectangle1 = new Rectangle(7.5, 4.1);
        Rectangle rectangle2 = new Rectangle(6.9, 5.3);

        GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник: " + largestRectangle);
    }
}
