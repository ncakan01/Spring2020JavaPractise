package day38_Constructors;

public class ConstructorCalls2 {   //2 kendi adiyla call olmaz ama this key word call edilir
    // const call need to be fist step  // 3yani ilk basa yazilir methoda yoksa eror verir  //4 cons sadece  this bir kere cagrilir

    public ConstructorCalls2(){
        System.out.println("Default constructor");

    }
    public ConstructorCalls2(int a){

        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls2(String str){
       // System.out.println("hello");  // ilk basa this yazilir
        this(10);// default , int argument
        //this();  //one const. can only call one constr
        System.out.println("Constructor with  String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("hello");  // 10 yazinca default ile int calusir
                                                                  // hello yazinca int ,default ve str calisir
        System.out.println(obj); // hes cod verir
    }
    public void method1(){
       // ConstructorCalls();

    }

    static {
        System.out.println("static");
    }

}
