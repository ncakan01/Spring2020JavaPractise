package day29_Wrapper_Arraylist;

public class ParseMetods {

    public static void main(String[] args) {

        String str="123";
         int a= Integer.parseInt(str); //123

        System.out.println(str+ 1 );// text
          //                "123" +1 = 1231
        System.out.println(a+ 1);//number
        //                 123 + 1 ==> 124


      byte b1 =   Byte.parseByte(str);  // byte = 123

        System.out.println(b1+5);

        //Integer I1 = Byte.parseByte(str);

        Integer I1 = (int)Byte.parseByte(str);//Autoboxing
        // integer =(int)byte;
        //integer=int;


        String str2="10.5";

       float f1= Float.parseFloat(str);   //float 10.5
        System.out.println(f1 + 1);


        double f2=Double.parseDouble(str2); // 10.5

        System.out.println(f2+1);


        String str3="3147483647";

        long num1 = Long.parseLong(str3);
        double num2 = Long.parseLong(str3);
        System.out.println(num1 +2);
        System.out.println(num2 +2);

        Long num3= Long.parseLong(str3);    // autoboxing
        System.out.println(num3 +2);

        String result1="true";
        boolean r1= Boolean.parseBoolean(result1);  // boolean ,
        System.out.println(!r1); // false


        String result2="fAlSe";
        boolean r2= Boolean.parseBoolean(result2);  // boolean ,
        System.out.println(r2); // false



    }
}
