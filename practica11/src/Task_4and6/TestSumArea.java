package Task_4and6;

public class TestSumArea {
    public static void main(String[] args) {

        GeometricObject[] geometricFigures = {
                new Circle(3.0),
                new Circle(7.0),
                new Rectangle(1.5, 4.0),
                new Rectangle(4.0, 7.5)
        };

        double aggregateArea = computeTotalArea(geometricFigures);

        System.out.println("Общая площадь всех объектов: " + aggregateArea);
    }

    public static double computeTotalArea(GeometricObject[] shapeArray) {
        double areaAccumulator = 0;
        for (GeometricObject currentShape : shapeArray) {
            areaAccumulator += currentShape.getArea();
        }
        return areaAccumulator;
    }
}
