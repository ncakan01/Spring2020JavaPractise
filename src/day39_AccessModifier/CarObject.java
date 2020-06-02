package day39_AccessModifier;

public class CarObject {
    public static void main(String[] args) {
        // new constructor

        Car car1 = new Car("Toyata");

        System.out.println(car1);

        Car car2 = new Car("BM","X6");

        System.out.println(car2);

        Car car3 = new Car("Lexus","RX", 2020);

        System.out.println(car3);

        Car car4 = new Car("Tesla","RXb", 2020,12000);

        System.out.println(car4);
    }
}
