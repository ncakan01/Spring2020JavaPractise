package day14_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String str1="CYBERTEK";
        String  str2="cybertek";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true ignore case sensetivity


        String s1 ="Cybertek School";
        boolean r1= s1.contains("School");// true
        System.out.println(r1);

        String s3="United States";
        System.out.println(s3.startsWith("U")); // TRUE


        String s4 ="Cybertek School";
        System.out.println(s4.endsWith("l"));// true
        System.out.println(s4.endsWith("School"));// true

        System.out.println(s4.endsWith("Cybertek")); // false







    }
}
