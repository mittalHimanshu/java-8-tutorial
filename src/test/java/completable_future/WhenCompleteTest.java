package completable_future;

import org.junit.Test;

public class WhenCompleteTest {

    /**
     * whenComplete method uses BiConsumer as an argument. Once the calling completion stage completes,
     * whenComplete method applies completion stage result on BiConsumer.
     * BiConsumer takes first argument as result and second argument as error if any.
     * */

    @Test
    public void testThird() {
        new WhenComplete().testThird();
    }
}