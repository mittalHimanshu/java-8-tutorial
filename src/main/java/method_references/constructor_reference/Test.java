package method_references.constructor_reference;

import method_references.static_method_reference.FunctionalInterface;

public class Test {

    private Test(){
        System.out.println("Hie...this is constructor method reference");
    }

    public static void main(String[] args) {
        FunctionalInterface functionalInterface = Test::new;
        functionalInterface.say();
    }

}
