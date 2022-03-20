import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int searchValue = 100;

        // Create a List of Integers with Stream
        Random r = new Random();
        List<Integer> data = Stream
                .generate(()->r.nextInt(1000))
                .limit(1000)
                .collect(Collectors.toList());

        // ThreadPool
        ExecutorService es = Executors.newFixedThreadPool(4);

        // list of Callables (Tasks to be made)
        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i=0; i<10; i++) {
            int start = i*100;
            callables.add(()->{
                for (int j=start; j<start+100; j++)
                    if (data.get(j)==searchValue)
                        return j;
                return -1;
            });
        }

        // Invoke Callables
        // Tell Executor to run them
        try {
            List<Future<Integer>> futures = es.invokeAll(callables);
            for (Future<Integer> future : futures)
                System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
    }
}