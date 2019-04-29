package method_references.constructor_reference;

import method_references.static_method_reference.FunctionalInterface;

public class Test {

    public Test(){
        System.out.println("Hie...this is constructor method reference");
    }

    static void testConstructorReference() {
        FunctionalInterface functionalInterface = Test::new;
        functionalInterface.say();
    }

}
