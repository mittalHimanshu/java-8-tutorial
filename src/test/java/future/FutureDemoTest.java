package future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureDemoTest {

    private Logger logger = LogManager.getLogger(FutureDemoTest.class);

    @Test
    public void calculate() throws InterruptedException, ExecutionException {
        FutureDemo squareCalculator = new FutureDemo();

        Future<Integer> future1 = squareCalculator.calculate(10);
        Future<Integer> future2 = squareCalculator.calculate(100);

        while (!(future1.isDone() && future2.isDone())) {

            logger.info(String.format(
                    "future1 is %s and future2 is %s",
                    future1.isDone() ? "done" : "not done",
                    future2.isDone() ? "done" : "not done"
            ));

            Thread.sleep(300);
        }

        Integer result1 = future1.get();
        Integer result2 = future2.get();

        logger.info(result1 + " and " + result2);
    }
}