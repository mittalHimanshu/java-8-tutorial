package fork_join_framework;

import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoin extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;
    private static final long threshold = 10_000;
    private static Logger logger = LogManager.getLogger(ForkJoin.class);

    private ForkJoin(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoin(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {

        int length = end - start;

        // Base case -> Threshold value
        if (length <= threshold) {
            return add();
        }

        /**
         * Creating sub tasks
         * */

        ForkJoin firstTask = new ForkJoin(numbers, start, start + length / 2);
        firstTask.fork(); //start asynchronously

        ForkJoin secondTask = new ForkJoin(numbers, start + length / 2, end);

        Long secondTaskResult = secondTask.compute();
        Long firstTaskResult = firstTask.join();

        return firstTaskResult + secondTaskResult;

    }

    private long add() {
        long result = 0;
        for (int i = start; i < end; i++) {
            result += numbers[i];
        }
        return result;
    }

    private static long startForkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoin(numbers);
        return new ForkJoinPool().invoke(task);
    }

    static void testForkJoin() {
        logger.info(ForkJoin.startForkJoinSum(100000));
    }

}