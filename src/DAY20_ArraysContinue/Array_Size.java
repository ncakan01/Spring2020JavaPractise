package DAY20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr1={1,2,3,};  // 0 ~ 2
            //      0 1 2

       // System.out.println(arr1[100]);  // array size is fixed

        int[] nums= new int[2];  // {0 ,0};    0~1

        nums[0]=10;  //{10,0}
        nums[1]=20; //{10,20}
        /// nums[2]=30;  array s size fixed

        System.out.println(nums[0]);
        System.out.println(nums[1]);

        nums=new int[3];   // REset . {0,0,0}

        System.out.println(nums[0]);  //0

        System.out.println(nums[1]); //0

    }
}
