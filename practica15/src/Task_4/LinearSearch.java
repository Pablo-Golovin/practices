package Task_4;

public class LinearSearch {
    public static <E extends Comparable<E>> int linearSearch(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9, 3};
        int position = linearSearch(numbers, 8);
        System.out.println("Позиция элемента 8: " + position);

        String[] words = {"яблоко", "банан", "апельсин", "груша"};
        position = linearSearch(words, "апельсин");
        System.out.println("Позиция слова 'апельсин': " + position);
    }
}

