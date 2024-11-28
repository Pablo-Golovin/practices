import java.util.Scanner;

public class task_2_to_4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("не число / не целое число");
        } catch (ArithmeticException e) {
            System.out.println("деление на 0");
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        task_2_to_4 example = new task_2_to_4();
        example.exceptionDemo();
    }
}
