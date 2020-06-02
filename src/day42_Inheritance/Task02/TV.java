package day42_Inheritance.Task02;
/*
create a class called TV:
				attributes: brand, model, price, country , type
				methods: watch, toString

 */
public class TV extends Device {

    public TV(String brand , String model , double price , String type , String size) {
        setDevice(brand, model, price, type, size);
    }

    public void watch(){
        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );
    }
}
