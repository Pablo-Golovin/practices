import java.util.Scanner;

public class task_8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Kлюч: ");
                String key = myScanner.nextLine();
                if (key.isEmpty()) {
                    throw new Exception("Пустой ключ");
                }
                System.out.println("Данные для " + key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова.");
            }
        }
        myScanner.close();
    }
}
