package Qpractice;

public class Assement2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
        int count=0;
        boolean x;
        String result="";
        for(int i=0; i<sentence.length(); i++) {
           result+= sentence.contains(target);
           count++;
        }
        if(count==2){
            x= true;
        }else{
            x=false;
        }
        return x;
    }

}
