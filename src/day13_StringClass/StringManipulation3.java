package day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {
         String str ="I like Java progaming";  // bu onemli int yaziyoruz cunku int deger vercek sonucu //
         int num1=str.indexOf("J");
        System.out.println(num1);

        String str2="Cybertek school is awesome";
        //            0123456789
        int firstS=str2.indexOf("s"); //9
        int secondsS=str2.indexOf("is") +1;
        //   str2.indexOf("is") ==>returns the index number of i

        System.out.println(firstS);
        System.out.println(secondsS);

        System.out.println("==============================================");

        int maxIndexnumber="Cybertek".length()-1;
        System.out.println(maxIndexnumber);

        String names ="Muhtar";
          int a1=   names.indexOf("u");
        System.out.println(a1);

        System.out.println("==================================================");

        String fullname ="Kuzzat Altay";
        String firstname=fullname.substring(0,6);
        String lastnmae=fullname.substring(7,12);
        System.out.println(firstname);
        System.out.println(lastnmae);







    }
}
