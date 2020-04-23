package day25MethodsRecap;

public class return_Statement {
    public static void main(String[] args) {


        if (10>9){
            return; // exist the current method
        }
       System.out.println("HELLO");


        method1();
        System.out.println("hello");

        method2();
        System.out.println("hello");
    }

    public static void  method1(){
        if (10>9){
            return;
        }
        System.out.println("hello cybertek");
    }
    public static void  method2(){
        if (10>9){
            System.exit(0);
        }
        System.out.println("hello cybertek");
    }

}
