package day14_StringClass;

import java.util.Scanner;

public class Credential2 {
    /*
        valid credentials are:
            username: cybertek
            password: cybertekschool

            precondition username and passoword cannot be empty
            if they are empty please enter the credential

        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username :");
        String inputUsername=input.next();

        System.out.println("Enter your passoword");
        String inputPassoword= input.next();

        boolean logedIn = inputUsername.equals("Cybertek") && inputPassoword.equals("cybertekshool");
        boolean invalidUserName =!inputUsername.equals("Cybertek") && inputPassoword.equals("cybertekshool");
        boolean invalidPassword=inputUsername.equals("Cybertek") && !inputPassoword.equals("cybertekshool");

        if (!inputUsername.isEmpty() && !inputPassoword.isEmpty()){
            if (logedIn){
                System.out.println(" logged in");
            }else if (invalidUserName){
                System.out.println("Password is correct , username is incorrect");
            }else if (invalidPassword){
                System.out.println("Username is correct , password is incorrect");
            }else {
                System.out.println("Both username and password are incorrect");
            }
        }else {
            System.out.println("Please created credentials");
        }


    }
}
