package day42_Inheritance;
class B{
    public B(int a){
        System.out.println("int");
    }

    public B(double a){
        System.out.println("double");
    }

    public B(long a){
        // this(4.5); // double
        this(10); //int
        System.out.println("long"); // long
        // this(4.5);
    }

}


public class InheritanceReveiw {
    public InheritanceReveiw(String a){
        super(); //int  long  // 19l
        System.out.println("String"); // string
    }


    public static void main(String[] args) {

        InheritanceReveiw obj = new InheritanceReveiw("Hello");

    }
}
