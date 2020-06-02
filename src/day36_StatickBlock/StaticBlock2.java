package day36_StatickBlock;

import OfficeHours.Tester;

public class StaticBlock2 {

    static int a;
    static int b;
    int c;
    /*
     if (100>200){
            a = 100;
        }else{
            b = 200;
        }
     */
    static Tester tester1 = new Tester();

    public static void main(String[] args) {
        System.out.println(tester1);
    }

    static{
        a =100;
        b= 200;
        // c = 300; // static only accepts static
        if(100 > 200){
            a = 100;
        }else{
            b= 200;
        }

        tester1.setInfo("Jean", "SDET",120000 , 123);  // mainde(run) yazamayiz only use static block


    }

}
