package Task_4and6;

public class Circle extends GeometricObject {
    private double radiusLength;

    public Circle() {
    }

    public Circle(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public Circle(double radiusLength, String colorValue, boolean isFilled) {
        this.radiusLength = radiusLength;
        setColorValue(colorValue);
        setFilledFlag(isFilled);
    }

    public double getRadiusLength() {
        return radiusLength;
    }

    public void setRadiusLength(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    @Override
    public double getArea() {
        return Math.PI * radiusLength * radiusLength;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radiusLength;
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radiusLength + ", площадью " + getArea() + " и периметром " + getPerimeter();
    }
}
