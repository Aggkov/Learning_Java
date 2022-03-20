import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("The Parent");

        CountDownLatch latch = new CountDownLatch(100);

        for (int i=0; i<100; i++) {
            int threadNumber = i;
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + threadNumber + " finished!");
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t + " finished!");

    }
}