package Qpractice;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

next3();
    }

    public static void next3() {
        for (int num = 0; num > 3; num++) {

            System.out.print(num + " ");
        }
    }
}