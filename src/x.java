public class x {
    public static void main(String[] args) {


String b = at3("nurgul","lina");
        System.out.println(b);
String c=removeFirst("aaaaa");
        System.out.println(c);

    }

    public static String biggerS(String a ,String b)
    {
        String result="";
        if(a.length()>b.length()){
            result = a;

        }else{
            result =b;
        }
      return result;
    }
    public static String at3(String target,String word){
        String result2="";

        result2=target.substring(0,3).concat(word).concat(target.substring(3,target.length()));

        return result2;

    }
    public static String removeFirst(String target) {
      String result3="";
      result3=target.substring(1, target.length());


return result3;
    }




    }