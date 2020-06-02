package day44_Exception;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {

    public static void main(String[] args) {

        System.out.println("test started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        try{
            System.out.println(list.get(10));
        }catch (IndexOutOfBoundsException e){

            System.out.println("Something went wrong");

        }

        System.out.println("Test completed");


    }
}