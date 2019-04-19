package refactoring_with_lambdas.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory {

    private final static Map<String, Supplier<Shape>> map = new HashMap<>();

    static {
        map.put("rectangle", Rectangle::new);
        map.put("circle", Circle::new);
    }

    public Shape getShape(String type){
        Supplier<Shape> shape = map.get(type);
        return shape.get();
    }

}
