package Qpractice;

import java.util.Scanner;

public class v {


    public static void main(String[] args) {
        max(10, 5);
        System.out.println(max(10, 5));
        cube();
        plus();
    }

    public static int max(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }

    }

    public static void cube() {
        //your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int y = n * n * n;
        System.out.println("cube of number n=" + y);

    }

    public static void plus() {

        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstnum = scan.nextInt();
        System.out.println("enter second number:");
        int secondnum = scan.nextInt();

        int sum = firstnum + secondnum;
        System.out.println(sum);


    }
}