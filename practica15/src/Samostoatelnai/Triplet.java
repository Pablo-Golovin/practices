package Samostoatelnai;

public class Triplet<A extends Comparable<A>> {
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean contains(A element) {
        return first.equals(element) ||
                second.equals(element) ||
                third.equals(element);
    }

    public A getMinimum() {
        A min = first;
        if (second.compareTo(min) < 0) {
            min = second;
        }
        if (third.compareTo(min) < 0) {
            min = third;
        }
        return min;
    }

    @SuppressWarnings("unchecked")
    public String sum() {
        if (first instanceof Number) {
            Number n1 = (Number) first;
            Number n2 = (Number) second;
            Number n3 = (Number) third;
            return String.valueOf(n1.doubleValue() + n2.doubleValue() + n3.doubleValue());
        } else {
            return first.toString() + " " + second.toString() + " " + third.toString();
        }
    }

    public A getFirst() {
        return first;
    }

    public A getSecond() {
        return second;
    }

    public A getThird() {
        return third;
    }
}

