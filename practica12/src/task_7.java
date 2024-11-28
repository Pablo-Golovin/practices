import java.util.Scanner;

public class task_7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Kлюч: ");
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова.");
            }
        }
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Пустой ключ");
        }
        System.out.println("Данные для " + key);
    }
}
