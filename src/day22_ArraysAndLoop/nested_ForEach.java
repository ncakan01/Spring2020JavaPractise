package day22_ArraysAndLoop;

public class nested_ForEach {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
                // 0 1 2 3 4
        for (int each  :arr) {
            System.out.print(each+ " ");

        }

        System.out.println();
        int[][] arr2D ={ {1,2,3 } , {4,5,6 } };
                //       0        ,   1
        for (int [] each1Darray: arr2D){
            for (int eachElement : each1Darray) {
                System.out.print(eachElement+ " ");

            }
        }

        System.out.println();
        char [][] ch2D={{'A', 'B'} , { 'C' ,'D', 'E'} , {'G', 'H'}};

        for (char [] each1DArray :ch2D) {
            for (char eachelement : each1DArray){
                System.out.print(eachelement+ " ");
            }
           // System.out.println(Arrays.toString(each1DArray));

        }
    }
}
