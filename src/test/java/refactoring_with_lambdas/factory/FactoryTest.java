package refactoring_with_lambdas.factory;

import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void getShape() {

        Supplier<Factory> shapeSupplier = Factory::new;
        shapeSupplier.get().getShape("circle").draw();
        shapeSupplier.get().getShape("rectangle").draw();

    }
}