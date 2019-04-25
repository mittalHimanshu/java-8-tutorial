package future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

    private ExecutorService executor = Executors.newSingleThreadExecutor(); // Can execute only one task

    // private ExecutorService executor = Executors.newFixedThreadPool(2); // Can execute 2 tasks in parallel

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }

}
