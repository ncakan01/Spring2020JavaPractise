package Qpractice;

import java.util.Scanner;

public class replit176 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    isPalindrome(num);
}

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int reversed = 0;
        for(int i=num; i>0; i--) {


            reversed = num--;
            boolean palindrome =num ==reversed;
            System.out.println(palindrome);
        }
        return ;

    }



}
