package day42_Inheritance.Task01;
/*
create a class called Data
				attributes:  name, age, gender
				methods: eat, walk, sleep,
 */

public class Person {
    public String name;
    public int age;
    public char gender;

    public void setPesrsoInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public  void eat(String food){
        System.out.println(name+ " is eating"+food);
    }
    public void sleep(){
        System.out.println(name+" is walking");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }



}
