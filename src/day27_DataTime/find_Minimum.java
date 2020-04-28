package day27_DataTime;

public class find_Minimum {
    public static void main(String[] args) {
        int [] arr ={5,4,7,5};


        int minimum=arr[0];
        for (int each : arr){ // each : 5 , 4, 7 ,5

            if(each < minimum){
                minimum=each;
            }

        }
        System.out.println(minimum);

        System.out.println("========================================================================");

        int [] arr2={1000,400,700,7,8,-4,-9};
        System.out.println(minimum(arr2));

        System.out.println("=========================================================================");

        double [] arr3={55.0,10.5,40.0,1.5,2.5 ,0};
        double num1=minimum(arr3);
        System.out.println(num1);

    }
    public static int minimum(int [] arr){

        int minimum=arr[0];
        for (int each : arr){ // each : 5 , 4, 7 ,5

            if(each < minimum){
                minimum=each;
            }

        }

        return minimum;
    }
    public static double minimum(double [] arr){


        double minimum=arr[0];
        for ( double each: arr){ // each : 5 , 4, 7 ,5

            if(each < minimum){
                minimum=each;
            }

        }
        return minimum;
    }
}
