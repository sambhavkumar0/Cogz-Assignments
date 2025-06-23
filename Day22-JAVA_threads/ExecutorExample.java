import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Runnable task = () -> System.out.println("Running: " + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) executor.execute(task);
        executor.shutdown();
    }
}