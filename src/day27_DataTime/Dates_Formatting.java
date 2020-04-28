package day27_DataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");   // mmm olursa april yazar  mm olursa 04 yazar


        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        CREATE A DATE called birthday = month/days/year
        ex:     2020 04 23
        APRIL/23/2020
         */

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE MMMM/dd/yyyy");   // mmm olursa april yazar  mm olursa 04 yazar  mmmm full name

        LocalDate date2= LocalDate.of(1999,12,25);
        String str1=date2.format(dtf2);
        System.out.println(str1);
        System.out.println("==================================================================");

        LocalDate date3= LocalDate.now();

        System.out.println(date3.format(dtf2));

    }
}


