package optional.implementation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
public class DisplayFeatures {

    @Getter
    private String size;
    @Getter
    private Optional<ScreenResolution> resolution;

}
