package day37_Constructors;

public class ConctructorIntro {

   // public method(){}  // Cnstructor Name MUST Be same with class name


    public ConctructorIntro(int a){
        System.out.println("Constroctor with  argument of int");

    }

    public static void main(String[] args) {

      //  ConctructorIntro obj = new ConctructorIntro();     //object Must be witth exixsiting constsructor

        ConctructorIntro obj2 = new ConctructorIntro(10);
        ConctructorIntro obj3 = new ConctructorIntro(10);
    }

}
