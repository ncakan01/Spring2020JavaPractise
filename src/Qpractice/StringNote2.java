package Qpractice;

public class StringNote2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //             012345678
        String schoolName= str.substring(0,8);
        System.out.println(schoolName);

        String fullName="Nurgul Kotil";
        //                0123456789

        String firstName=fullName.substring(0,6);
        String lastName=fullName.substring(7,12);

        System.out.println(firstName);
        System.out.println(lastName);

        //full name = firstname  lastnnema
        //gmail: lastname_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        //               01234567
        String firstname=Murtaza.substring(0,7);

        String lastname=Murtaza.substring(8,15);
        System.out.println(firstname);
        System.out.println(lastname);


        //String gmail=lastname.concat("_").concat(firstname.concat("@gmail.com"));
        //String gmail=lastname+"_"+firstname+"@gmail.com";
        String gmail =Murtaza.substring(8,15)+"_"+Murtaza.substring(0,7)+"@gmail.com";
        System.out.println(gmail);

        String s1 = "I love Java Progmming Java";
        //          012345678

        String className=s1.substring(8);
        System.out.println(className);

        System.out.println("=================================================================");


        String s2= "  I like C# Programming C# ";
        s2= s2.replace("C#","Java");
        System.out.println(s2);


        String name= "Covid 18";
        name = name.replace("8" ,"9");
        System.out.println(name);









    }
}
