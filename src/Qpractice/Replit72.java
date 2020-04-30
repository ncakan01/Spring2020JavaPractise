package Qpractice;

import java.util.Scanner;

public class Replit72 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            if(email.contains("_")){
                String first= email.substring(0,email.indexOf("_"));
                String last= email.substring(email.indexOf("_")+1,email.indexOf("@"));
                String domain=email.substring(email.indexOf("@"));

                System.out.println(last+"_"+first+domain);

            }else{
                System.out.println(email);
            }




        }
    }

