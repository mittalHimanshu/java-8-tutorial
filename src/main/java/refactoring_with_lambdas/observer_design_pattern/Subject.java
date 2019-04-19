package refactoring_with_lambdas.observer_design_pattern;

public interface Subject {

    void registerObserver(Observer o);
    void notifyObserver(String tweet);

}
