public class Main {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        t.setName("Main");

        Thread sleeper = new Thread(new Thread_1(), "Sleeper");
        sleeper.start();
        try {
            Thread.sleep(1000);
            System.out.println(t + " interrupting " + sleeper);
            // Send interrupt message to Thread 1. Message gets caught by exception in run()
            sleeper.interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("=".repeat(50));
        Thread worker = new Thread(new Thread_2(), "Worker");
        worker.start();
        try {
            // After half a second worker thread will be interrupted and we will see how far the loop counted.
            Thread.sleep(500);
            System.out.println(t + " interrupting " + worker);
            worker.interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}