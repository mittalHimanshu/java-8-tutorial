package refactoring_with_lambdas.strategy;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Project lombok is a java library that automatically plugs
 * getters, setters, equal methods etc into your editor with
 * the use of annotations only.
 * */

@AllArgsConstructor
class Book {
    private @NotNull @Getter @Setter
    String name;
    private @NotNull @Getter @Setter
    String author;
    private @NotNull @Getter @Setter
    Boolean isAvailable;

    @Override
    public String toString() {
        return name;
    }
}