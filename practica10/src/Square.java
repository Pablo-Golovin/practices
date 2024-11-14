public class Square extends GeometricObject implements Colorable {
    private double diagonal;

    public Square() {
        this.diagonal = Math.sqrt(2);
    }

    public Square(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getSide() {
        return diagonal / Math.sqrt(2);
    }

    public void setSide(double side) {
        this.diagonal = side * Math.sqrt(2);
    }

    @Override
    public double getArea() {
        double side = getSide();
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте квадрат, начиная с углов и двигаясь к центру");
    }

    @Override
    public String toString() {
        return String.format("Квадрат с диагональю %.2f, стороной %.2f, площадью %.2f и периметром %.2f",
                diagonal, getSide(), getArea(), getPerimeter());
    }

    public boolean isGoldenRatio() {
        double side = getSide();
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return Math.abs(diagonal / side - goldenRatio) < 0.0001;
    }
}
