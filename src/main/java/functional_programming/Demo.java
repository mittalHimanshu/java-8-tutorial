package functional_programming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class Demo {

    private Logger logger = LogManager.getLogger(Demo.class);

    public void testUtils() {
        Function<Integer,Integer> add1 = Utils::add1;
        Function<String,String> concat1 = Utils::concat1;
        Integer two = add1.apply(1);
        String answer = concat1.apply("0 + 1 = ");
        logger.info(two);
        logger.info(answer);
    }

    void curryingFunction(){
        Function<Integer, Function<Integer, Integer>> curryAdder = u -> v -> u + v;
        logger.info("Add 2, 3 :" + curryAdder.apply(2).apply(3));
    }

}
