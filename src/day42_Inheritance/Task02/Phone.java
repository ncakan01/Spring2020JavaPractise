package day42_Inheritance.Task02;
/*
create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */

public class Phone extends Device {
    public Phone(String brand ,String model ,double price ,String type, String size) {
       setDevice(brand ,model , price ,"Phone", size);
    }
    public void  call(long number){
        System.out.println("Calling the number: "+number);
    }
    public void text(long number){
        System.out.println("texting to : "+ number);

    }
}
