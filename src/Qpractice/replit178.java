package Qpractice;

public class replit178 {
    public static int[] mergR(int[] a,int[] b) {
        int [] arr =new int[a.length+b.length];
        for (int i=0; i<a.length; i++){
            arr[i]=a[i];

        }
        for(int j =0; j < b.length; j++){
            arr[j + a.length] = b[j];
        }
        return arr;
    }

    public static void main(String[] args) {
        //mergR();

        int a ='b';
        System.out.println(a);
    }
}
