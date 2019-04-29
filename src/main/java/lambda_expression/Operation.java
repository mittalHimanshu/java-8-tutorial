package lambda_expression;

import date_time.DateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Operation {

    private Logger logger = LogManager.getLogger(Operation.class);

    public void doOperation() {

        // lambda expressions

        MathInterface addition = Integer::sum; // Method Reference for (int a, int b) -> a + b;
        MathInterface subtraction = (int a, int b) -> a - b;
        MathInterface multiplication = (int a, int b) -> a * b;
        MathInterface division = (int a, int b) -> a / b;

        logger.info(addition.operate(10, 5));
        logger.info(subtraction.operate(10, 5));
        logger.info(multiplication.operate(10, 5));
        logger.info(division.operate(10, 5));


        // lambda body

        MathInterface mathInterface = (int a, int b) -> {
            logger.info("First Number : " + a);
            logger.info("Second Number : " + b);
            return 1;
        };

        mathInterface.operate(2, 7);

    }

}
