package day40_Encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
        //System.out.println( Zarina.SSN );

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN:  "+Zarina.getSSN());

       // System.out.println(Zarina.ID);

        Zarina.setID(234);
        System.out.println("Zarina' ID:  "+Zarina.getSSN());
    }

}
