package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
        //this(20.0);
        System.out.println("A");
        // this(0.5)  //  ilk basta cagrilir

    }
    public ConstructorPractice(int a){
        this();   // double default
        //this(10.5)
        System.out.println("B");

    }
    public ConstructorPractice(double a){
        //this();  // cunku default double icerir
        //this(5.5); // itself
      //this(10); // because int contains double

        System.out.println("C");

    }



    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice();
        new ConstructorPractice();
    }
}
