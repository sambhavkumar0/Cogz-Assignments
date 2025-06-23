class SharedResource {
    private boolean ready = false;

    public synchronized void waitForSignal() throws InterruptedException {
        while (!ready) {
            wait();
        }
        System.out.println("Got signal! Processing...");
    }

    public synchronized void sendSignal() {
        ready = true;
        notify();
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread waiter = new Thread(() -> {
            try {
                resource.waitForSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread signaler = new Thread(() -> {
            try {
                Thread.sleep(2000);
                resource.sendSignal();
                System.out.println("Signal sent!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        waiter.start();
        signaler.start();
    }
}