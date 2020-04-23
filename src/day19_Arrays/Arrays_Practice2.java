package day19_Arrays;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        int[] arr={10 , 20 , 30};
        System.out.println(arr.length);//3
        int[] arr2=new int[5];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        String[] tester= new String[3];//{"Reem" , "Medina" , "Osman"}
        // index: 0 1 2
        tester[0]="Reem";
        tester[2]="Osman";
        tester[1]="Medina";
        System.out.println(tester[0]);
        System.out.println(tester[1]);
        System.out.println(tester[2]);

        System.out.println(tester.length);  //3
        System.out.println("========================================================");
        String[] students= new String[10];
        
    }
}
