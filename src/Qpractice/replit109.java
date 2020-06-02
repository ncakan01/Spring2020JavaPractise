package Qpractice;

import java.util.Scanner;

public class replit109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below

        for (String each : arr) {
            String str = "" + each.substring(0, 3);
            System.out.println(str);

        }

    }
}
