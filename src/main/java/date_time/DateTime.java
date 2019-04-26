package date_time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTime {

    private Logger logger = LogManager.getLogger(DateTime.class);

    void readingValues(){

        LocalDate localDate = LocalDate.now();
        logger.info("Year : " + localDate.getYear());
        logger.info("Month : " + localDate.getMonth());
        logger.info("Day : " + localDate.getDayOfMonth());
        logger.info("Day Of Week : " + localDate.getDayOfWeek());
        logger.info("Days : " + localDate.lengthOfMonth());
        logger.info("Leap : " + localDate.isLeapYear());

    }

    void readingFromTemporalField(){

        LocalDate localDate = LocalDate.now();
        logger.info(localDate.get(ChronoField.YEAR));
        logger.info(localDate.get(ChronoField.MONTH_OF_YEAR));
        logger.info(localDate.get(ChronoField.DAY_OF_MONTH));

    }

    void readingTime() {

        LocalTime localTime = LocalTime.now();
        logger.info("Hour : " + localTime.getHour());
        logger.info("Minute : " + localTime.getMinute());
        logger.info("Second : " + localTime.getSecond());

    }

    void parsingDateTime(){
        LocalDate date = LocalDate.parse("2014-03-18");
        LocalTime time = LocalTime.parse("13:45:20");
        logger.info(date.getYear());
        logger.info(time.getHour());
    }

    void duration(){
        LocalDate localDate = LocalDate.now();
        LocalDate bDay = LocalDate.of(1998, Month.JULY, 15);
        Period age = Period.between(localDate, bDay);
        logger.info("Current Age : "+age);

        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusSeconds(3600);
        Duration duration = Duration.between(instant1, instant2);
        logger.info("Time Duration : "+duration);
    }

    void manipulatingDate(){
        LocalDate date = LocalDate.of(2014, 3, 18);
        date = date.with(ChronoField.MONTH_OF_YEAR, 9);
        date = date.plusYears(2).minusDays(10);
        logger.info(date);
    }

    void timeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        String formattedDate = date1.format(formatter);
        logger.info(formattedDate);
    }

}
