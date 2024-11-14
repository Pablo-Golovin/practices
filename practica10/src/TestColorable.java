public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(7.2),
                new Rectangle(4.8, 9.1),
                new Square(4.3),
                new ComparableRectangle(5.7, 8.4),
                new Square(6.9)
        };

        for (GeometricObject obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
