package day14_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str="I like to learn Java. I like to watch movie Jumanji";
        int a1 =str.indexOf("J");// returns the index num of first matching character
        System.out.println(a1);
       int a2= str.indexOf("Jum");
        System.out.println(a2);
        int a3 = str.indexOf(" I") +1;//secod i index num
        System.out.println(a3);

        String s="I like Java, and I like reading";
        int b=s.lastIndexOf("I");
        System.out.println(b);

        int b2=s.lastIndexOf("l");
        System.out.println(b2);

        String z="I like C# , C# is cool";
        int c1 = z.indexOf("C#");
        System.out.println(c1);

        String x = "I like Java, Java is fun, Java proeamming is fun";
        int d = x.indexOf("Java is");
        System.out.println(d);

        int d2 =x.indexOf(", J")+2;
        System.out.println(d2);


    }
}
