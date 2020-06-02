package day38_Constructors;

public class Test {

    public Test(){
        System.out.println("Constructor block");
        //Constructor block depends on object
    }

    static{
        System.out.println("Static block");
        /// static block : executed first one tme only
    }
    {
        System.out.println(" instance block");

        // instance block depends on object // yani obje varsa calisir // instance block before run cont block
    }
    public static void main(String[] args) {
        System.out.println("main method");
        new Test(); // it prins instance and const // instance and constblock depends on object // yani obje varsa calisir
        System.out.println("main method");
       // new Test();


    }

}
