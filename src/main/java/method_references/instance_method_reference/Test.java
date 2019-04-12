package method_references.instance_method_reference;

import method_references.static_method_reference.FunctionalInterface;

public class Test {

    private void saySomething(){
        System.out.println("Hie...this is instance method reference");
    }

    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new Test()::saySomething;
        functionalInterface.say();
    }

}
