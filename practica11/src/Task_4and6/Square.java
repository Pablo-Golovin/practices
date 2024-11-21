package Task_4and6;

public class Square extends GeometricObject implements Colorable {
    private double edgeLength;

    public Square() {
        this.edgeLength = 1;
    }

    public Square(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double getArea() {
        return edgeLength * edgeLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * edgeLength;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + edgeLength + ", площадью " + getArea() + " и периметром " + getPerimeter();
    }
}
