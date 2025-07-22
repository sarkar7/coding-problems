package sarkar.java.date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Day {
    int day;
    DaysInWeek daysInWeek;
    int weekNo;
}
