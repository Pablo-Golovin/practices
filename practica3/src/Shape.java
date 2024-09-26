public abstract class Shape {
    protected String color = "#FFFFFF";
    protected boolean filled = false;

    Shape() {}

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        if (filled) {
            return color;
        }
        else {
            return "not_filled";
        }

    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
