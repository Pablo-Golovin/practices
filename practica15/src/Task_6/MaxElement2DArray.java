package Task_6;

public class MaxElement2DArray {
    public static <E extends Comparable<E>> E findMax(E[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        E max = array[0][0];
        for (E[] row : array) {
            for (E element : row) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Наибольший элемент в массиве чисел: " + findMax(numbers));

        String[][] words = {
                {"яблоко", "банан"},
                {"апельсин", "груша"},
                {"киви", "манго"}
        };
        System.out.println("Наибольший элемент в массиве строк: " + findMax(words));
    }
}

