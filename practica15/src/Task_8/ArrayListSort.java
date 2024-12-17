package Task_8;

import java.util.ArrayList;

public class ArrayListSort {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            E temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        System.out.println("До сортировки: " + numbers);
        sort(numbers);
        System.out.println("После сортировки: " + numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("яблоко");
        words.add("банан");
        words.add("апельсин");
        words.add("груша");

        System.out.println("\nДо сортировки: " + words);
        sort(words);
        System.out.println("После сортировки: " + words);
    }
}

