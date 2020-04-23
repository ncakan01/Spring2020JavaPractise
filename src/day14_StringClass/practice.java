package day14_StringClass;

public class practice {
    public static void main(String[] args) {
        String gmail= "cybeertekschool@gmail.com";

        String userinputGmail="CybertekSchool@gmail.com";

        boolean result =  gmail.equalsIgnoreCase(userinputGmail);// true
        if (result){
            System.out.println("logged in");
        }

        System.out.println("===========================================");
/*
valid password Must contain a special  characters such as (! , _ ,$)
valid password should contain spaces
 */

            String Password = "mmasd 12345";
            if (Password.contains(" ")){
                System.out.println("Password cannot have space in it");
            }else {
                System.out.println("valid passoword");
            }
        System.out.println("===================================================");
            /*
            every website has wwww. at begenning of adresss
             */

            String webAdress="www.amazon.com";
            if (webAdress.startsWith("www.")){
                // false
                System.out.println("valid");


                System.out.println("=================================================");

                String email=" CybertekSchool@Yahoo.com";
                if (email.endsWith("@gmail.com")) {
                    System.out.println("valid Gmail");
                }else{
                    System.out.println("invalid gmail");
                }
                /*
                Write a program that csn validate if a web adress in valid

                valid adress :
                             Must satart with www.
                             Must end with .com , or , edu , or . net  or gov
                 */








            }









    }
}
