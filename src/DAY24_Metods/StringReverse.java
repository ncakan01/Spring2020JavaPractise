package DAY24_Metods;

public class StringReverse {
    public static void main(String[] args) {

        Reverse("cybertek");

      String retun=   Reverse2("NURGUL" );

    }


    public static void Reverse(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        System.out.println(Reverse);
    }

    public static String Reverse2(String str) {
        String Reverse2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse2 += str.charAt(i);
        }
        System.out.println(Reverse2);
        return Reverse2;
    }

}
