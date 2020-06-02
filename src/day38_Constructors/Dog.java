package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){

        name = "unknown";  // set the default value for all instance
        breed = "unknown";
        age = 0;
    }
    public Dog(String breed){
        this.breed = breed;
        name = "unknown";
        age = 0;

    }



    public Dog(String breed , int age){
        this.breed = breed;
        this.age = age;
        name = "unknown";


    }
    public Dog(int age , String breed){
        this.age = age;
        this.breed = breed;

    }
    public String toString(){
        return "Name: "+name +", breed: "+breed+", age: "+age;
    }


/*
    public void method1(){

    }
    public void method1(int a){}

 */

    }

