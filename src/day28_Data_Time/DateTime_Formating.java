package day28_Data_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formating {
    public static void main(String[] args) {


        LocalDateTime dateTime1 = LocalDateTime.of(2020,3,20,11,25,30);

        System.out.println(dateTime1);

        //12/25 11:30 am, Tue

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");

        String str = dateTime1.format(dtf)  ;

        System.out.println(str);




    }
}
