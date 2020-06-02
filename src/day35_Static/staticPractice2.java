package day35_Static;

public class staticPractice2 {


    String brand;
    String Model;
   static boolean hasWheels = true;


    public void printBrand(){
        System.out.println(brand); // instance metod object kurmadan calismaz

    }

    public void printModel(){
        System.out.println(Model);
       // System.out.println(hasWheels);  // hic birsey cikmiyor
    }

    public static void main(String[] args) {
        //System.out.println(brand);

        System.out.println(hasWheels);
    }



}
