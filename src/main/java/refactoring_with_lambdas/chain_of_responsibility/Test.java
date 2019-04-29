package refactoring_with_lambdas.chain_of_responsibility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {

    private Logger logger = LogManager.getLogger(Test.class);

    public void test(){

        UnaryOperator<String> firstProcess = (String text) -> "Hello " + text;
        UnaryOperator<String> secondProcess = (String text) -> text.concat(" Mittal");

        Function<String, String> pipeline = firstProcess.andThen(secondProcess);

        logger.info(pipeline.apply("Himanshu"));

    }

}
