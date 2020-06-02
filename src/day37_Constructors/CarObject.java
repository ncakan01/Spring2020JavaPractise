package day37_Constructors;

public class CarObject {
    public static void main(String[] args) {


        Car car1 = new Car("BMW", "X6", 2020, 100000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);
        Car car2 = new Car("Audi", "Q7", 2020, 360000);
        System.out.println(car2);


    }
}