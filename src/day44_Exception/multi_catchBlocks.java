package day44_Exception;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(100/0);
        }catch (ClassCastException e){
            System.out.println("Class Cats");

        }catch (NoSuchElementException e){
            System.out.println("No such element");

        }catch (ArithmeticException e){
            System.out.println("Arithmetic");

        }catch (RuntimeException e){
            System.out.println("Run time ");

        }catch (Exception e){
            System.out.println("Exception e");

        }

    }
}
