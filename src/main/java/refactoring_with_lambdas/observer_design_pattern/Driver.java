package refactoring_with_lambdas.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Driver implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObserver(String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }

}
