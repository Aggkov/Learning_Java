import java.util.ArrayList;

public class Resource {
    private ArrayList<Integer> al;

    Resource() {
        al = new ArrayList<>();
    }

    public synchronized void add (int elem) {
        // Thread that manages to enter
        // this method will be wrapped
        Thread t = Thread.currentThread();

        try {
            Thread.sleep(2000);
            System.out.println("\n" + t + "Added data: " + elem);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        al.add(elem);
        // Imagine the producer enters and adds an element.
        // Afterwards he will need to notify the consumers.
        notifyAll();
    }

    public synchronized int remove() throws InterruptedException{
        Thread t = Thread.currentThread();

        if (al.isEmpty()) {
            System.out.println(t + "is waiting...");
            // throws InterruptedException
            // Thread is waiting a producer to notify it.
            wait();
        }

        int elem = al.remove(0);
        System.out.println(t + "removed data: " + elem);

        return elem;
    }
}
