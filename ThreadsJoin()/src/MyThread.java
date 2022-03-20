public class MyThread implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(500);
                System.out.println(t + " step: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t + ": exiting");
    }
}