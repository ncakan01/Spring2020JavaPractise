package Resources;

import day39_AccessModifier.AccessModifiers;

public class AccessModifier_Test {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicAccess);   // open to the word
       // System.out.println(obj.defaultAccess);   // default : only accessible within same package

       // System.out.println(obj.SSN);  // only accessible within same class

    }
}
