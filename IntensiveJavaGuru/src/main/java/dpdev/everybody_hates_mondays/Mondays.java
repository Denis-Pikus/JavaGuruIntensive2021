package dpdev.everybody_hates_mondays;
import java.time.LocalDate;

import static java.time.DayOfWeek.MONDAY;
import static java.time.Period.ofWeeks;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

public class Mondays {
    static long count(LocalDate birthday, final LocalDate today) {
//        return (birthday = birthday.plusYears(22)).isAfter(today) ? 0 :
//                birthday.with(nextOrSame(MONDAY)).datesUntil((birthday = birthday.plusYears(56))
//                        .isBefore(today) ? birthday : today.plusDays(1), ofWeeks(1)).count();

        long countOfMondays = 0;
        LocalDate date = birthday.plusYears(22);
        if (birthday.isAfter(today) || birthday.plusYears(22).isAfter(today)) {
            return 0;
        } else {
            while (!date.getDayOfWeek().equals(MONDAY)) {
                date = date.plusDays(1);
            }
            for (LocalDate date1 = date; date1.isBefore(today); date1 = date1.plusWeeks(1)) {
                if (date1.getDayOfWeek().equals(MONDAY)) {
                    if(!date1.isBefore(birthday.plusYears(78))){
                        return countOfMondays;
                    }
                    countOfMondays++;
                }
            }
        }
        return countOfMondays;
    }
}
