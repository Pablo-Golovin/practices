package Task_3;

public class RecursivePrinter {
    public static void printNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a);
            return;
        }

        System.out.print(a + " ");

        if (a < b) {
            printNumbers(a + 1, b);
        } else {
            printNumbers(a - 1, b);
        }
    }

    public static void main(String[] args) {
        printNumbers(5, 1);
        System.out.println();
        printNumbers(1, 5);
    }
}
