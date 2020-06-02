package day34_CustomClass;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name + " is eating " +food);
    }
    public void drinking(String diring){
        System.out.println(name+" is drinking "+diring);
    }
    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }
    public void studying(String subject){
        System.out.println(name+" is studying "+subject);
    }

    public void setDogInfo(String breed , String size , int age, String color,String name){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;

        // this keyword is used for calling object instance(instance variable)



    }

    public String toString(){
        return "Dog name: "+name + ", breed: "+ breed+", size: "+size+", age: "+age+", color: "+color;
    }
}
