package Task_4;

public class DigitSumCounter {
    public static int countNumbers(int k, int d) {
        if (k == 0) {
            return (d == 0) ? 1 : 0;
        }

        int count = 0;
        int start = (k == 1) ? 1 : 0;

        for (int i = start; i <= 9; i++) {
            if (d - i >= 0) {
                count += countNumbers(k - 1, d - i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 3;
        int d = 15;
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + d + ": " + countNumbers(k, d));
    }
}
