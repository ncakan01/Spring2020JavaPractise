package day13_StringClass;

public class StringManipulation {
    public static void main(String[] args) {

        String str="Cybertek";
        //          01234567
        char ch1=str.charAt(5);
        System.out.println(ch1=='A'); // 't
        //                  't'=='A'  false

        System.out.println(ch1=='T');
        //                   't'=='T'

        System.out.println("=======================================================================");

        int totalLength=str.length();
        System.out.println(totalLength);  //8

        System.out.println(totalLength>10);

        String str2="Total is great day , Java is Fun";
        //          012345667..........
        int maxIndexNum=str2.length()-1;

        System.out.println("======================================================================");

        String s1="Cybertek";
               s1=s1.concat(" School");   // "Cybertek  School"
        System.out.println(s1);

        String s2="Java";
        System.out.println(s2.concat(" is programming language"));
        System.out.println(s2);             // java
        s2=s2.concat(" is programming language");
        System.out.println(s2);

        String r1="java is fun";
        r1=r1.concat(" , and it's easy");
        System.out.println(r1);

        System.out.println("============================================================================");

        String name1="CYBERTEK";
        name1=name1.toLowerCase();
        System.out.println(name1);

        String name2="cybertek scholl";
        name2=name2.toUpperCase();
        System.out.println(name2);

        System.out.println("============================================================================");

        String A1="         Today is  agreat day";
         A1=A1.trim();                //         remove the space
        System.out.println(A1);

        System.out.println("============================================================================");






    }
}
