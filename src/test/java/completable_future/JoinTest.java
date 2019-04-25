package completable_future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class JoinTest {

    private Logger logger = LogManager.getLogger(Join.class);

    /**
     * join method returns the result after completion or throws CompletionException. This method waits for the completion of calling completion stage.
     * */

    @Test
    public void testOne() {

        new Join().testOne()
                .forEach(s -> logger.info(s));

    }
}