public class task_5_to_6 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("ключ null в getDetails");
        }
        System.out.println("Данные для ключа: " + key);
    }

    public static void main(String[] args) {
        task_5_to_6 demo = new task_5_to_6();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Перехват исключения: " + e.getMessage());
        }
    }
}