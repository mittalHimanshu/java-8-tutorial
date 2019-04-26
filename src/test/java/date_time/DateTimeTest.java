package date_time;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateTimeTest {

    @Test
    public void readingValues() {
        new DateTime().readingValues();
    }

    @Test
    public void readingFromTemporalField() {
        new DateTime().readingFromTemporalField();
    }

    @Test
    public void readingTime() {
        new DateTime().readingTime();
    }

    @Test
    public void parsingDateTime() {
        new DateTime().parsingDateTime();
    }

    @Test
    public void duration() {
        new DateTime().duration();
    }

    @Test
    public void manipulatingDate() {
        new DateTime().manipulatingDate();
    }

    @Test
    public void timeFormatter() {
        new DateTime().timeFormatter();
    }
}