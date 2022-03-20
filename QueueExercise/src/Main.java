import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        /*1.Bob enters queue
          2.Tom enters
          3.Bob gets serviced
          4.Pam enters row
          5.Tom gets serviced
          6.Pam gets serviced
         */

        q.add("Bob");
        q.add("Tom");
        System.out.println(q.remove() + " served");
        q.add("Pam");
        System.out.println(q.remove() + " served");
        System.out.println(q.remove() + " served");
    }
}