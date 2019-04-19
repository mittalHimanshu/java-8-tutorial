package refactoring_with_lambdas.observer_design_pattern;

public class NYTimes implements Observer {

    @Override
    public void notify(String tweet){
        if(tweet.contains("NYTimes")){
            System.out.println("Breaking news in NYTimes");
        }
    }

}
