package default_method;

public interface TestInterface {

    void square(int a);

    /**
     * Consider you want to update this existing interface by adding a new method as -->
     * void show(). The problem here lies is after update of existing api, the previous
     * version cannot be compiled because it does not contain the implementation of show()
     * To overcome this default methods are introduced which provides the implementation of
     * new method which will be inherited automatically without giving compiling errors.
     * But now since java 8 interfaces support implementations it means multiple inheritance is
     * now possible but at a cost of "Diamond Problem". To overcome this problem either we define
     * in the code which method to call specifically or provide its own implementation.
     * */
    default void show(){
        System.out.println("Default method executed");
    }

}
