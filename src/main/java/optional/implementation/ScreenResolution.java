package optional.implementation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ScreenResolution {

    @Getter
    private int width;
    @Getter private int height;

}