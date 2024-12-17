package Task_5;

public class MaxElementSearch {
    public static <E extends Comparable<E>> E findMax(E[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        E max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5.0),
                new Circle(3.0),
                new Circle(7.2),
                new Circle(2.5),
                new Circle(6.1)
        };

        Circle maxCircle = findMax(circles);
        System.out.println("Наибольший круг: " + maxCircle);

        // Дополнительный тест
        Integer[] numbers = {5, 2, 8, 1, 9, 3};
        Integer maxNumber = findMax(numbers);
        System.out.println("Наибольшее число: " + maxNumber);
    }
}
