package method_references.static_method_reference;

public class Test {

    private static void saySomething(){
        System.out.println("Hie...this is static method reference");
    }

    public void testStaticReference() {
        FunctionalInterface functionalInterface = Test::saySomething;
        functionalInterface.say();
    }

}
