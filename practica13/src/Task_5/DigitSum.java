package Task_5;

public class DigitSum {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Сумма цифр числа " + number + " равна: " + sumOfDigits(number));
    }
}
