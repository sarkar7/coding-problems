package sarkar.java.date;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintCalendarAdv {

    static DaysInWeek[] daysInWeek = {
            DaysInWeek.SUNDAY,
            DaysInWeek.MONDAY,
            DaysInWeek.TUESDAY,
            DaysInWeek.WEDNESDAY,
            DaysInWeek.THURSDAY,
            DaysInWeek.FRIDAY,
            DaysInWeek.SATURDAY
    };

    static List<Day> dayList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month between 1 and 12 : ");
        int month = input.nextInt();
        System.out.print("Enter a Full Year : ");
        int year = input.nextInt();
        createMonth(year, month);

        System.out.println(dayList.size());
        System.out.println(dayList);

    }

    private static void createMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        int weekNo = 1;
        int day = LocalDate.of(year, month, 1).getDayOfWeek().getValue();

        for (int i = 1; i <= yearMonth.getMonth().length(yearMonth.isLeapYear()); i++, day++) {
            if (day > 6) {
                day = 0;
                weekNo++;
            }

            dayList.add(new Day(i, daysInWeek[day], weekNo));
        }
    }


}
