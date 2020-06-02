package day42_Inheritance.Task02;

public class DeviceObject {
    public static void main(String[] args) {


        TV tv1 = new TV("Samsung","E250", 500, "40 inches","90" );
        tv1.country = "USA";
        System.out.println( tv1 );


        Phone phone1 = new Phone("Iphone ","11",1000,"large","L");

        System.out.println(phone1);
    }
}