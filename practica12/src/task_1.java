public class task_1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление а 0");
        }
    }

    public static void main(String[] args) {
        task_1 example = new task_1();
        example.exceptionDemo();
    }
}
