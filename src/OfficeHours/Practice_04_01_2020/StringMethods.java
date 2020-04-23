package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {

        //charAt(indexNumber):returns the char at given index , char primitive


        String str1 ="Java " ;
//                    01234
        char ch1 = str1.charAt(3);
        System.out.println(ch1);
        char ch2 = str1.charAt(0);
        System.out.println(ch2);

        System.out.println("=================================================================");
        // lenght(): returns the total number of char , int

        String str2="Cybertek School";
        int total = str2.length();
        System.out.println(total);

        int maxindex=str2.length()-1;
        char ch3=str2.charAt(maxindex);// last index number

        System.out.println(ch3);
        System.out.println(maxindex);
        System.out.println("=====================================================================");

        // concat(str):concatenation ,returns new String + also does concatenation
        String str3="Cybertek";
        str3=str3.concat("School"); // "Cybertek School"
        System.out.println(str3);

        String str4 ="Java";
        str4=str4.concat("is fun");// "Java is fun"
        System.out.println(str4);

        System.out.println("=======================================================================");

        //tolowerCase() & toUpperCase() change the case of the String to upper or lower case RETURN NEW STRING


        String str5 = "CYBERTEK SCHOOL";
        str5=str5.toLowerCase(); // "cybertek school"
        System.out.println(str5);


        String str6 = "muhtar";
        str6=str6.toUpperCase(); // MUHTAR;
        System.out.println(str6);

        System.out.println("============================================================================" );

        // trim(): removes unused white space from the String , returns new String
        String str7 = "Cybertek";
        System.out.println(str7);
        System.out.println(str7.length());


        String str8 ="          ";
        str8= str8.trim();
        System.out.println(str8);// empty
        System.out.println(str8.length());//0
        System.out.println("=========================================================================");


        //substring (beginingindex , ending index ): creates substring from begining index till ending index(ending

        String sentence="I like java";
                       //012345678910
        // last index number = lenght -1
         String word1=sentence.substring(7,sentence.length());
         String word2=sentence.substring(2,5+1);
                  // likeJava
        String word3=sentence.substring(2,6)+sentence.substring(7,sentence.length());
        System.out.println(word3);

        System.out.println(word1);
        System.out.println(word2);

        //
        // substring (begining index): creates the substring from begining index till end of the string . return new string

        String sentence2 = "I like to learn Java";
        //                  0123456789
        String r1 =sentence2.substring(10); // " learn Java
        System.out.println(r1);

        String r2 = "Java";
        //           0123
        String r3 = r2.substring(0,2) ;// ja
        String r4 =r2.substring(2,3);//v
        r4= r4.toUpperCase();


        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; // JaVa

        System.out.println(result);


        System.out.println("=============================================");

        //replace(old str, new str): replaces all the matching ones, returns new string
        String str = "I like C#, C# is cool";
        str =   str.replace("C#" , "Java" ); // "I like Java, Java is cool"

        System.out.println(str);

        //replaceFirst(old str, new str): replace the firast matching one, returns new string
        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst(", Java", ", C#");
        System.out.println(t1);

        System.out.println("=============================================");
        // indexOf(str): returns the index of first matching character, as an int
        String y1 = "Today W is Wednesday";
        int a1 =  y1.indexOf("W");  // first W' index num
        int a2 = y1.indexOf("Wednesday");  // second W' index num
        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf(str): returns the index of last matching character, as an int
        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); // last S' index number
        System.out.println(a3);





































    }
}
