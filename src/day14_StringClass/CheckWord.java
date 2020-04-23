package day14_StringClass;

import java.util.Scanner;

public class CheckWord {
    /*1. Write a program CheckWords:
    Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

     */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word :");
        String word1=input.next();

        System.out.println("Enter second word:");
        String word2=input.next();

        System.out.println("Enter second word:");
        String word3=input.next();

        int lenght1 = word1.length();
        int lenght2 = word2.length();
        int lenght3= word3.length();

        boolean notsame = lenght1!=lenght2 && lenght2!=lenght3;

        if (lenght1==lenght2 && lenght2==lenght3){
            System.out.println("All words are same lenght");
        }else if (notsame){
            System.out.println("All diffrent lenght");
        }else{
            System.out.println("not same nor diffrent lengths");
        }




    }
}
