package refactoring_with_lambdas.observer_design_pattern;

public class Guardian implements Observer {

    @Override
    public void notify(String tweet){
        if(tweet.contains("Guardian")){
            System.out.println("Breaking news in Guardian");
        }
    }

}
