package day38_Constructors;

public class ConstructorCalls3 {  // 5. //const cann not call it self
                           // const cannot call itself or caontain

    public ConstructorCalls3(){
        this(9);  // int argument
        System.out.println("default");
        //this(9);

    }
    public ConstructorCalls3(int a){
       // this();  //defaulta daha onceden int cagirdigimiz icin itself oluyor
       /// this(10);    //const cann not call it self
        System.out.println("int argument");

    }
    public ConstructorCalls3(String str){
       // this("hello");  // string oldugu icin kendi icinde cagrilmaz
    }

    public static void main(String[] args) {   // cont calistirmasi herzaman object ile olur
        ConstructorCalls3 obj = new ConstructorCalls3();
        new ConstructorCalls3();
    }

    public void method1(){
       // this();
    }

}
