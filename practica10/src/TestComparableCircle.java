public class TestComparableCircle {
    public static void main(String[] args) {

        ComparableCircle comparableCircle1 = new ComparableCircle(3.5);
        ComparableCircle comparableCircle2 = new ComparableCircle(4.7);

        GeometricObject largestComparableCircle = GeometricObject.max(comparableCircle1, comparableCircle2);
        System.out.println("Наибольший из двух кругов ComparableCircle: " + largestComparableCircle);

        ComparableCircle circle = new ComparableCircle(7.2);
        Rectangle rectangle = new Rectangle(5.6, 6.8);

        GeometricObject largestShape = GeometricObject.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largestShape);
    }
}
