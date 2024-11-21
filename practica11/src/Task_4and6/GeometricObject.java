package Task_4and6;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String colorValue = "синий";
    private boolean isFilledFlag;
    private java.util.Date creationDate;

    protected GeometricObject() {
        creationDate = new java.util.Date();
    }

    protected GeometricObject(String colorValue, boolean isFilledFlag) {
        creationDate = new java.util.Date();
        this.colorValue = colorValue;
        this.isFilledFlag = isFilledFlag;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    public boolean isFilledFlag() {
        return isFilledFlag;
    }

    public void setFilledFlag(boolean isFilledFlag) {
        this.isFilledFlag = isFilledFlag;
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "создано " + creationDate + "\nцвет: " + colorValue +
                " и заливка: " + isFilledFlag;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject obj) {
        return Double.compare(this.getArea(), obj.getArea());
    }

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }
}
