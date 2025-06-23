public class ThreadClassExample extends Thread {
    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadClassExample t1 = new ThreadClassExample();
        ThreadClassExample t2 = new ThreadClassExample();
        t1.start();
        t2.start();
    }
}