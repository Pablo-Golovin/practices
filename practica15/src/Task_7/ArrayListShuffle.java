package Task_7;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListShuffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Random random = new Random();

        for (int i = list.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("До перетасовки: " + numbers);
        shuffle(numbers);
        System.out.println("После перетасовки: " + numbers);
    }
}

