package dpdev.everybody_hates_mondays;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        long count = Mondays
                .count(LocalDate.of(1995, 4, 2), LocalDate.of(2097, 12, 3));

        long count1 = Mondays.count(LocalDate.of(2025,1,1), LocalDate.of(3100, 1, 1));
        System.out.println(count);
        System.out.println(count1);
//        long count = Mondays
//                .count(LocalDate.of(2000, 1, 1), LocalDate.of(2022, 01, 31));
//        System.out.println(count);
    }
}
