package day41_Inheritance;

public class Fish extends Animal{

    public void  swim(){
        System.out.println(name + " is swiming");

    }
    public static void main(String[] args) {

        Fish obj1 = new Fish();
        obj1.name= "Nemo";
        obj1.weight = 5;
        obj1.size = "Small";

        //System.out.println(obj1.name);
       obj1.eat();
       obj1.move();
       obj1.swim();

    }
}
