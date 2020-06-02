package day36_StatickBlock;

public class StaticBlock {

    static{
        System.out.println("hello word");   // static block heryerde yerlesebilir
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
        method1();
    }


    public static void method1(){
        System.out.println("Custom method executed");   // custom metod called main method olmasi lazim
    }

    static{
        System.out.println("static block executed");
        // static block heryerde yerlesebilir   //  ONEMLI OLAN ILK STATIC BLOCK GERCEKLESIR

        // runs fist only runs onee timee
    }

}
