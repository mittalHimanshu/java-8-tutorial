package lambda_expression;

/**
 * A functional interface is an interface which contains only
 * one abstract method and/or default methods
 * */

@FunctionalInterface
public interface MathInterface {

    int operate(int a, int b);

}
