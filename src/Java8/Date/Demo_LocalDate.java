package Java8.Date;

import java.time.LocalDate;
import java.time.Month;

public class Demo_LocalDate {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        System.out.println(now);
        LocalDate date=LocalDate.of(2022,05,20);
        System.out.println(date);
        date=LocalDate.of(2022, Month.APRIL,20);
        System.out.println(date);
        date=LocalDate.parse("2015-02-26");
        System.out.println(date);
        date=date.plusDays(4);
        System.out.println(date);
        date=date.plusMonths(4);
        System.out.println(date);
        boolean isBefore=LocalDate.parse("2020-03-12").isBefore(LocalDate.parse("2018-06-14"));
        System.out.println(isBefore);
        boolean isAfter=LocalDate.parse("2020-03-12").isAfter(LocalDate.parse("2018-06-14"));
        System.out.println(isAfter);
    }
}
