public class RunnableExample implements Runnable {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample());
        Thread t2 = new Thread(new RunnableExample());
        t1.start();
        t2.start();
    }
}