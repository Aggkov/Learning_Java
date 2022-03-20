import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("Main Thread");

        Resource al = new Resource();

        Thread[] producers = new Thread[2];
        for(int i = 0; i < producers.length; i++) {
            producers[i] = new Thread(new Producer(i * 10, al));
            producers[i].start();
        }

        Thread[] consumers = new Thread[3];
        for(int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new Consumer(i ,al));
            consumers[i].start();
        }

        try {
            for(int i = 0; i < producers.length; i++)
                // We wait for producers to finish their work
                producers[i].join();
            for(int i = 0; i < consumers.length; i++)
                consumers[i].interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t + " Exiting");
    }
}
