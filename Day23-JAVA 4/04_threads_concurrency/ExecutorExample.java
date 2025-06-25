import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("Task 1 from " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 2 from " + Thread.currentThread().getName()));

        executor.shutdown();
    }
}