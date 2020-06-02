package day44_Exception;

import java.util.NoSuchElementException;

public class finally_Block {
    public static void main(String[] args) {


        try {
            System.out.println(9 / 0);
            System.out.println("Try block");
        } catch (NoSuchElementException e) {
            System.out.println("Catch");

        }finally {
            System.out.println("finally");
        }
    }
}