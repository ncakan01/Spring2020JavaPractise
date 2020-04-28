package day28_Data_Time;

import java.time.LocalDate;

public class LocalDate_practice {
    public static void main(String[] args) {
        String[] friends = {"John", "Aaron", "Daniel"};
        LocalDate Johnbirthday = LocalDate.of(2020, 3, 5);
        LocalDate Aaronbirthday = LocalDate.of(2020, 3, 5);
        LocalDate Danielbirthday = LocalDate.of(2020, 3, 5);

        LocalDate[] birthday = {Johnbirthday, Aaronbirthday, Danielbirthday};
//                               0               1              2
        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            LocalDate bd = birthday[i];

            System.out.println(name +"'s birthday is "+bd);

        }

    }
}