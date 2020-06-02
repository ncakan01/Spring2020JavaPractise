package Qpractice;

public class ebobekok {
    public static void main(String[] args) {
        int n1=48 , n2= 160 , ebob=1, ekok;
        for ( int i=1; i<=n1 && 1<=n2 ; i++){
            if (n1%i==0 && n2%i == 0){
                ebob=i;
            }
        }
        ekok=(n1* n2)/ebob;
        System.out.println(n1+ " ve "+ n2 +" sayilarin ebob'u  " + ebob);
        System.out.println(n1+ " ve "+ n2 +" sayilarin ekok'u  " + ekok);
    }
}
