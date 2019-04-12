package lambda_expression;

public class Operation {

    public static void main(String[] args) {

        // lambda expressions

        MathInterface addition = Integer::sum; // Method Reference for (int a, int b) -> a + b;
        MathInterface subtraction = (int a, int b) -> a - b;
        MathInterface multiplication = (int a, int b) -> a * b;
        MathInterface division = (int a, int b) -> a / b;

        System.out.println(addition.operate(10, 5));
        System.out.println(subtraction.operate(10, 5));
        System.out.println(multiplication.operate(10, 5));
        System.out.println(division.operate(10, 5));


        // lambda body

        MathInterface mathInterface = (int a, int b) -> {
            System.out.println("First Number : " + a);
            System.out.println("Second Number : " + b);
            return 1;
        };

        mathInterface.operate(2, 7);

    }

}
