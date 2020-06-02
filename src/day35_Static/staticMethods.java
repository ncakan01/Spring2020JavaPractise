package day35_Static;

public class staticMethods {

    int a = 100;
    static int b = 200;

    public static void main(String[] args) {

        //System.out.println(a);      // static only accept static

        staticMethods obj = new staticMethods();
        // instance belongs to object yani objye ait
// o yuzden obj.a yazdik sadece a yazsaydik kabul etmicekti.
        System.out.println( obj.a );

        System.out.println("==============================================================");

        System.out.println(b);    // 200 static obj olmadan cagrilir
        System.out.println(staticMethods.b);
        System.out.println(obj.b);  // static prefers to be called through class name
    }




    public  void method(){
        System.out.println(a);  // burda objeye bagli INSTANCE
        System.out.println(b);
    }
}
