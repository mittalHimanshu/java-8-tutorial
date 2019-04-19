package refactoring_with_lambdas.template_design_pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemplateTest {

    @Test
    public void processCustomer() {
        new Template().processCustomer(1, "Himanshu Mittal", (Customer c) -> {
            System.out.println(c.getName());
        });
    }
}