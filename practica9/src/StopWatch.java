public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public StopWatch() {
        reset();
    }

    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
        }
    }

    public void stop() {
        if (running) {
            endTime = System.currentTimeMillis();
            running = false;
        }
    }

    public void reset() {
        startTime = 0;
        endTime = 0;
        running = false;
    }

    public long getElapsedTime() {
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public boolean isRunning() {
        return running;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();

        System.out.println("Сортировка 100,000 чисел методом выбора:");

        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        sw.start();
        selectionSort(numbers);
        sw.stop();

        System.out.println("Время выполнения: " + sw.getElapsedTime() + " мс");
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
