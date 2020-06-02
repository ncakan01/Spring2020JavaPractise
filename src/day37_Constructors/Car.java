package day37_Constructors;

public class Car {
    String brand ;
    String model;
    int year;
    double price;

    public Car(String brand ,String model , int year,double price){
        this.model = model;
        this.brand = brand;
        this.year=year;
        this.price=price;

    }
    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
    }

}


