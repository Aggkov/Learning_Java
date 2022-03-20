public class Thread_1 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        try {
            // Thread 1 will sleep for 5 seconds
            System.out.println(t + " sleeping: ");
            Thread.sleep(5000);
            // When Thread 1 gets interrupted this exception will occur
        } catch (InterruptedException e) {
            System.out.println(t + " interrupted ");
        }
        System.out.println(t + " exiting");
    }
}