package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArray {
    public static void main(String[] args) {

        String [] arr1={"A" ,"B" ,"C"};
        String [] arr2={"D" ,"E","F" ,"G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i= 0; i < arr1.length; i++){
            String eachElement = arr1[i];
            list.add(eachElement);  // arr[i];

        }
        for (String eachElement : arr2){
            list.add(eachElement);
        }
        System.out.println(list);
    }
}
