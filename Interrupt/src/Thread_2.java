public class Thread_2 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (long i = 0; i < 1000000000L; i++) {
            // For every 100.000 steps a check is performed to see if thread is interrupted (is.interrupted())
            if (i%100000L==0 && t.isInterrupted()) {
                System.out.println(t + " interrupted(i=" + i + ")");
                return;
            }
        }
        System.out.println(t + ": exiting");
    }
}