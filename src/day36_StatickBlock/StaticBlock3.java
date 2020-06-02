package day36_StatickBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {
    static String name;
    static int num;


    static Tester tester1 ;



    static {
        name = "muhtar";
        num = 1233;
        tester1 = new Tester();
        tester1.setTesterInfo("Nurgul ",12345566,"SDET",10000);

    }

   /*
    public static void main(String[] args) {

        name = "Muhtar";
        num = 200;

        System.out.println(name);
        System.out.println(num);
        Note = baska classdan called ettigimizde null degerini verir bize o yuzden STATIC BLOCK icinde yazariz
         */
}

