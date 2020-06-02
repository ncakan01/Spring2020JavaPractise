package day44_Exception;

public class try_catchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            Thread.sleep(15000);
        }catch (Exception e){

            System.out.println("Catch Block");
        }

        System.out.println("Word");

    }
}
