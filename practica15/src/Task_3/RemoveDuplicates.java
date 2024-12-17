package Task_3;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();

        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

    // Для проверки
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        System.out.println("Исходный список: " + numbers);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Список без дубликатов: " + uniqueNumbers);
    }
}
