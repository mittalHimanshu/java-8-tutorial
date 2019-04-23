package default_method;

public class TestClass implements TestInterface {

    @Override
    public void square(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.square(2);
        d.show();
    }
}
