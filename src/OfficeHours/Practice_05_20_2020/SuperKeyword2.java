package OfficeHours.Practice_05_20_2020;


class TestData{
    int num = 100;
    String name = " Cybertek";

    public void method(){
        System.out.println("Ceybertek school");
    }
}

public class SuperKeyword2 extends TestData{

    int num = 200;
    String name = "MIT";

    public void method (){
        System.out.println("MIT School");
    }

    public SuperKeyword2() {

       super.method();
        System.out.println(this.num);//200
        System.out.println(super.num);//100
        System.out.println(super.name);// Cybertek
        System.out.println(this.name);// MIT

    }

    public static void main(String[] args) {
        SuperKeyword2 obj = new SuperKeyword2();

    }
}
