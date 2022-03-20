public class Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("Main Thread");

        // State Runnable
        Thread[] producers = new Thread[3];
        for(int i = 0; i < producers.length; i++) {
            // Initialize Threads with runnable
            producers[i] = new Thread(new Producer(), "Producer " + i);
            producers[i].start();
        }
        Thread[] consumers = new Thread[5];
        for(int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new Consumer(), "Consumer " + i);
            consumers[i].start();
        }

        // All 8 threads will run
        try {
            for(int i = 0; i < producers.length; i++)
                producers[i].join();
            for(int i = 0; i < consumers.length; i++)
                consumers[i].join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
        // And then main thread will run in the end
        System.out.println(t + ": Exiting");


    }
}
