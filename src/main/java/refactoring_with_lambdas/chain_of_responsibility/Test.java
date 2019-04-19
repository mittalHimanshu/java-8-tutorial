package refactoring_with_lambdas.chain_of_responsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {

    public void test(){

        UnaryOperator<String> firstProcess = (String text) -> "Hello " + text;
        UnaryOperator<String> secondProcess = (String text) -> text.concat(" Mittal");

        Function<String, String> pipeline = firstProcess.andThen(secondProcess);

        System.out.println(pipeline.apply("Himanshu"));

    }

}
