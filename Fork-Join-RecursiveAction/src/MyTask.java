import java.util.concurrent.*;

public class MyTask extends RecursiveAction {
    int n;

    MyTask(int n) {
        this.n = n;
    }

    // Recursion
    @Override
    protected void compute() {
        if (n==0) {
            System.out.println("done");
        }
        else {
            // Print 5 numbers
            for (int i=n; i>n-5; i--)
                System.out.println("i: " + i + " n: " + n);
            // Re-run with new n
            invokeAll(new MyTask(n-5));
        }
    }
}