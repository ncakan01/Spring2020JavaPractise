package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter user name:");
        String username=input.next();

        System.out.println("Enter pass word:");
        String password=input.next();

        boolean valid=(username.equals("cybertek")&& password.equals("cybertek123"));
         int count=1;
        while(!valid){
            System.out.println("Please re-enter your credentions");
            System.out.println("Enter user name");
             username=input.next();

            System.out.println("Enter pass wors");
             password=input.next();

             valid=(username.equals("cybertek")&& password.equals("cybertek123"));

             count++;
             if (count==3){
                 System.out.println("Your account locked");
                 break;
             }
        }
       if (valid){
           System.out.println("Logged in");
       }

    }
}
