package functional_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testUtils() {
        new Demo().testUtils();
    }

    @Test
    public void curryingFunction() {
        new Demo().curryingFunction();
    }
}