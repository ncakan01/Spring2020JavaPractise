package day44_Exception;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Java");
        waits(3.5);
        System.out.println("Cybertek");
    }
    public static  void waits(double second){
        try {
            Thread.sleep((long)(second*1000));
        }catch (Exception e){

        }
    }
}
