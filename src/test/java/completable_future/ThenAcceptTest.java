package completable_future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class ThenAcceptTest {

    private Logger logger = LogManager.getLogger(ThenAcceptTest.class);

    /**
     * thenAccept method accepts Consumer as an argument.
     * On the completion of any completion stage, thenAccept method applies Consumer on the result and returns CompletableFuture.
     * */

    @Test
    public void testSecond() {

        new ThenAccept().testSecond()
                .forEach(s -> logger.info(s));

    }
}