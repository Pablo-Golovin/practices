package Task_9;

import java.util.ArrayList;

public class ArrayListMax {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым");
        }

        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        System.out.println("Наибольшее число: " + max(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("яблоко");
        words.add("банан");
        words.add("груша");
        words.add("апельсин");
        System.out.println("Наибольшая строка: " + max(words));
    }
}

