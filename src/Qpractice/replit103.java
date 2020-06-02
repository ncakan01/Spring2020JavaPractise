package Qpractice;

import java.util.Scanner;

public class replit103 {
    public static void main(String[] args) {
        for(int i=20; i<=80 ; i++ ) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }


        }
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String arr[] = sentence.split(" ");
        String arr1 [] = new String [arr.length];
        for (int i= 0; i<arr1.length; i++) {
            arr1[i] = arr[arr1.length-1-i]; {
                reversed +=arr1[i]+" ";
            }
        }
        reversed = reversed.trim();
        System.out.println(reversed);

    }
}
