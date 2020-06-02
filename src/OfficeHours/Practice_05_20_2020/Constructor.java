package OfficeHours.Practice_05_20_2020;


class Test{
    public Test( int c) {
        System.out.println("A");
    }
}


public class Constructor extends Test {

    public Constructor() {   // AB
      // this(10);
       super(30);// A

        System.out.println("B");
    }

    public static void main(String[] args) {
       // Constructor obj = new Constructor();   // AB
        Test test = new Test(10);  // A


    }
}
