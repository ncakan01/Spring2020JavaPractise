package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1="Cat";
        String str2=new String("Cat");

        System.out.println(str1+ " : "+str2);
        System.out.println(str1==str2) ;// two different object ,false


        String str3="Cat"; // Sring pool
        System.out.println(str1==str3);  //true

        String str4=new String("Cat");
        System.out.println(str2==str4);  // two indepened object , false

        String s1="Java";  // String pool , immutable we cannot modify it

        s1="JavaScrip";// new Object will be created in memory

        System.out.println(s1);// java Script

        String s2="Java";  // no new object will be created in the memory

        System.out.println(s1==s2);
        //               "JavaScrip"=="Java"







    }
}
