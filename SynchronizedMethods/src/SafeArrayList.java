import java.util.ArrayList;

public class SafeArrayList {
    private ArrayList<Integer> al;

    public SafeArrayList() {
        al = new ArrayList<>();
    }

    // This method will be used by one Thread at a time to add an element to the Object of this Class
    public synchronized void add(int elem) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        al.add(elem);
        System.out.println("Added: " + this);
    }

    @Override
    public String toString() {
        return al.toString();
    }
}