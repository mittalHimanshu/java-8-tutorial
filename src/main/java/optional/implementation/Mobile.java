package optional.implementation;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
public class Mobile {

    @Getter private long id;
    @Getter private String brand;
    @Getter private String name;
    @Getter private Optional<DisplayFeatures> displayFeatures;

}
