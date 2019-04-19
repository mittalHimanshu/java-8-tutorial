package refactoring_with_lambdas.template_design_pattern;

import java.util.function.Consumer;

/**
 * Templating --> We define a common template in which the implementation can be changed by subclassing it or using lambdas
 * In this example Consumer interface is used which represents a function which takes one argument and produces result but
 * does not return anything.
 * */

public class Template {

    public void processCustomer(int id, String name, Consumer<Customer> makeCustomerHappy){
        Customer c = new Customer(id, name);
        makeCustomerHappy.accept(c);
    }

}
