package refactoring_with_lambdas.strategy;

/**
 * A functional interface is an interface which contains only
 * one abstract method and/or default methods
 * */

@FunctionalInterface
interface BookInterface {
    boolean test(Book book);
}
