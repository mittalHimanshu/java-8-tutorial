package behaviour_parameterization;

/**
 * A functional interface is an interface which contains only
 * one abstract method and/or default methods
 * */

@FunctionalInterface
interface BookTestInterface {
    boolean test(Book book);
}
