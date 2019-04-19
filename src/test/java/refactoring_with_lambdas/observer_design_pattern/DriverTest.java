package refactoring_with_lambdas.observer_design_pattern;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    private Driver driver;

    @Test
    public void notifyObserver() {
        driver.notifyObserver("Guardian");
    }

    @Before
    public void setUp() throws Exception {
        driver = new Driver();
        driver.registerObserver(new NYTimes());
        driver.registerObserver(new Guardian());
    }
}