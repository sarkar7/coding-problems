package sarkar.java.date;

import java.time.LocalDate;
import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {

        int day = LocalDate.of(2023, 11, 1).getDayOfWeek().getValue();
        System.out.println(day);

        System.out.println(LocalDate.of(2023, 11, 22).getDayOfWeek());



    }

}
