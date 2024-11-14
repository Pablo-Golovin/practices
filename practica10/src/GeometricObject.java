public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "зелёный";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "создано " + dateCreated + "\nцвет: " + color +
                " и заливка: " + filled;
    }

    // Абстрактные методы для площади и периметра
    public abstract double getArea();
    public abstract double getPerimeter();

    // Реализация интерфейса tasks_1_to_3.Comparable
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    // Статический метод для поиска наибольшего объекта tasks_1_to_3.GeometricObject
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
}