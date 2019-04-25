package completable_future;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetNowTest {

    /**
     * getNow is a method that if calling completion stage is not completed then the value passed to getNow will be set to result.
     * At the time of calling getNow, if thread is completed, then that result is returned else the default value set by getNow will be returned.
     * */

    @Test
    public void testFourth() {
        new GetNow().testFourth();
    }
}