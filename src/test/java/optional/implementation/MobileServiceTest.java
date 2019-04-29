package optional.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Optional;


public class MobileServiceTest {

    private Logger logger = LogManager.getLogger(MobileServiceTest.class);

    @Test
    public void getMobileScreenWidth() {

        ScreenResolution resolution = new ScreenResolution(750,1334);
        DisplayFeatures dfeatures = new DisplayFeatures("4.7", Optional.of(resolution));
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));

        MobileService mService = new MobileService();

        int width = mService.getMobileScreenWidth(Optional.of(mobile));
        logger.info("Apple iPhone 6s Screen Width = " + width);

        Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", Optional.empty());
        int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
        logger.info("Apple iPhone 16s Screen Width = " + width2);

    }
}