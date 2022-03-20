import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(2);

        // First Task
        // Submit Callable Task to Executor
        // When Task is finished it will return 1
        Future<Integer> res1 = es.submit(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });

        // Submit second Task
        Future<Integer> res2 = es.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 2;
        });

        // While we wait for results we can perform other tasks
        boolean printed1=false, printed2=false;
        try {
            // Are both Tasks done?
            // If yes get me the result
            while (!(res1.isDone() && res2.isDone())) {
                Thread.sleep(500);
                if (res1.isDone() && !printed1) {
                    System.out.println("First Result: " + res1.get());
                    printed1=true;
                }
                else if (res2.isDone() && !printed2) {
                    System.out.println("Second Result: " + res2.get());
                    printed2=true;
                }
                else {
                    System.out.println("No results yet");
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();

    }
}