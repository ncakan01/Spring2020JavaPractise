package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {
// chrome , firefox , opera
    public static void main(String[] args) {


     NoSuchElementException    obj = new NoSuchElementException();

     // throw  obj ;

      //  throw new NoSuchElementException();

       // System.out.println();

/*
        boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It's break time , we should take break" );
        }

 */

        try {
            throw new IOException();
        } catch (IOException e) {

        }


    }
}