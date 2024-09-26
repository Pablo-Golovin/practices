public class Rectangle extends Shape {
    protected double width = 1;
    protected double length = 1;

    Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    double getArea() {
        return width * length;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}