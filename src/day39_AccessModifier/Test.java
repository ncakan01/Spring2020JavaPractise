package day39_AccessModifier;

public class Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println( obj.defaultAccess );
        System.out.println( obj.publicAccess);

        //System.out.println(obj.SSN);  // only accessible within same class
    }
}
