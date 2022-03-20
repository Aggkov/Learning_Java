import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();

        // Run this Task (Compute takes over)
        pool.invoke(new MyTask(100));

        pool.shutdown();
    }
}