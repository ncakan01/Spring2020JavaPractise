package Qpractice;

import java.util.Scanner;

public class replit73 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String first="First name: "+email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
        String last="Last name: " +email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@"));
        String domain="Domain: "+email.substring(email.indexOf("@")+1,email.indexOf("."));
        String toplevl="Top-Level Domain: "+email.substring(email.indexOf(".")+1);

        System.out.println(first+"\n"+last+"\n"+domain+"\n"+toplevl);



    }
}

