import java.util.concurrent.*;

public class ConcurrentMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        Runnable writer = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("key" + i, i);
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Map size: " + map.size());
    }
}