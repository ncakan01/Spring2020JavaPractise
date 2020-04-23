package day14_StringClass; /*
                Write a program that csn validate if a web adress in valid

                valid adress :
                             Must satart with www.
                             Must end with .com , or , edu , or . net  or gov
                 */


public class WebAdress {
    public static void main(String[] args) {


        String website = "www.cybertek.Gov";
        website = website.toLowerCase();

        boolean validEnding =website.endsWith(".com") || website.endsWith("edu") || website.endsWith("gov");


        if (website.startsWith("www.") && validEnding){


            System.out.println("Valid adress");
        }
        else {

        System.out.println(" Invalid adress");
    }

    }
}