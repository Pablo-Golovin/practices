package Task_4and6;

public class Rectangle extends GeometricObject {
    private double sideLength;
    private double sideWidth;

    public Rectangle() {
    }

    public Rectangle(double sideLength, double sideWidth) {
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    public Rectangle(double sideLength, double sideWidth, String colorValue, boolean isFilled) {
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
        setColorValue(colorValue);
        setFilledFlag(isFilled);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideWidth() {
        return sideWidth;
    }

    public void setSideWidth(double sideWidth) {
        this.sideWidth = sideWidth;
    }

    @Override
    public double getArea() {
        return sideLength * sideWidth;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideLength + sideWidth);
    }

    public String toString() {
        return "прямоугольник со сторонами " + sideLength + " и " + sideWidth + ", площадью " + getArea() + " и периметром " + getPerimeter();
    }
}
