package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){  //1.only const. can call other const
                                // 2. this();  we call another const

        method1();
        method2();

    }

    public ConstructorCalls(int a){
        //ConstructorCalls();
        this();
    }
    public static void method1(){
        //method2();     /// eger biz method2 void yazsak static metotda cagiramayiz

        //ConstructorCalls(); cagiramayiz burda
    }
    public  void method2(){

        method1();
    }


}
