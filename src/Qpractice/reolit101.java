package Qpractice;

import java.util.Scanner;

public class reolit101 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below

        for (String each : words) {
            String str = ""+ each.charAt(0) + each.charAt(each.length()-1);
            System.out.println(str);

        }
    }
}