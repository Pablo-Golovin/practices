public class Square extends Rectangle {
    Square() {}

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    double getSide() {
        return getWidth();
    }

    void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
