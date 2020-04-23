package day14_StringClass;
 /*
            username :cyberyek
            password:cybertekschool
             */

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        String ValidUserName = "cybertek";
        String validPassword="cybertekschool";

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username :");
        String inputUsername=input.next();

        System.out.println("Enter your passoword");
        String inputPassoword= input.next();
       boolean validCredential=inputUsername.equals(validPassword) && inputPassoword.equals(validPassword);
        if (validCredential) {
            System.out.println("Login in successfelly");
        }else{
            System.out.println("invalid credentials");

        }

    }
}
