package Task_4and6;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject shape1 = new Circle(3);
        GeometricObject shape2 = new Rectangle(7, 2);

        System.out.println("Одинаковая ли площадь у двух фигур? " +
                isAreaEqual(shape1, shape2));

        printGeometricObjectInfo(shape1);

        printGeometricObjectInfo(shape2);
    }

    public static boolean isAreaEqual(GeometricObject figure1,
                                      GeometricObject figure2) {
        return figure1.getArea() == figure2.getArea();
    }

    public static void printGeometricObjectInfo(GeometricObject figure) {
        System.out.println();
        System.out.println("Площадь равна " + figure.getArea());
        System.out.println("Периметр равен " + figure.getPerimeter());
    }

}
