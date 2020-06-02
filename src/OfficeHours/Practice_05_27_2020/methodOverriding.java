package OfficeHours.Practice_05_27_2020;

public class methodOverriding {

    public void method1(){
        System.out.println("Super class");
    }
}

class Test extends methodOverriding{

    @Override
    public  void method1 (){
        System.out.println("Sub class");

    }

    public static void main(String[] args) {

        methodOverriding obj = new methodOverriding();
        obj.method1();

        Test obj2 = new Test();
        obj2.method1();
    }

    // same yada more visible olmali method access modifier
    //visibility  public > protected > default > private


}