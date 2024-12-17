package Samostoatelnai;

public class TripletTest {
    public static void main(String[] args) {
        Triplet<Integer> numbers = new Triplet<>(5, 2, 8);
        System.out.println("Содержит 2? " + numbers.contains(2));
        System.out.println("Минимальное число: " + numbers.getMinimum());
        System.out.println("Сумма чисел: " + numbers.sum());

        Triplet<String> strings = new Triplet<>("Привет", "мир", "Java");
        System.out.println("\nСодержит 'мир'? " + strings.contains("мир"));
        System.out.println("Минимальная строка: " + strings.getMinimum());
        System.out.println("Конкатенация строк: " + strings.sum());
    }
}

