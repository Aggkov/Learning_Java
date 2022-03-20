import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        String arr[] = {"A", "B", "C", "D", "E"};
        for(int i = 0; i < arr.length; i++)
            q.add(arr[i]);

        //Print content of queue
        System.out.println(q);

        //Removes first element from queue
        System.out.println("Removing " + q.remove());

        //Add another element in queue (end of line)
        q.add("F");
        System.out.println("Added F ");

        System.out.println("Elements in queue: " + q.size());

        //Remove elements from queue until queue is empty. When empty it will throw exception and I will catch it.
        try {
            while(true) {
                System.out.println("Remove: " + q.remove());
            }
        }  catch (NoSuchElementException e) {
                System.out.println("Queue is empty! ");
        }

        }
    }

