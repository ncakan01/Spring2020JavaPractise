package day28_Data_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDataTime {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);

        // 2020-03-20  11:25:30

        LocalDate date = LocalDate.of(2020 ,3 ,20);
        LocalTime time = LocalTime.of(11,25,30);

        LocalDateTime datetime= LocalDateTime.of(date,time);
        System.out.println(datetime);
        


    }
}
