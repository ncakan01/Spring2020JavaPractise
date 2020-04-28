package day21_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] nums ={1,2,3,4,};

        for (int eachelement : nums) {
            System.out.println(eachelement);

        }
        String [] student={ "muhtar" , "asiya" , "muradul"};

        for (String eachStudent:student){
            System.out.println(eachStudent);

        }

        int [] arr1={1,2,3,4,5,6,7,8,9,10};

        for (int each : arr1){
            if (each<5){
                continue;
            }
            System.out.println(each);
        }

        System.out.println("=====================================================");

        String sentence ="I like Java";  // Java like I

        String [] words=sentence.split(" "); //[I ,like ,Java"]

        for (String eachword : words){
            System.out.println(eachword);
        }

        System.out.println("========================================================");

        for (int i=words.length-1 ; i>=0; i--){

            System.out.println(words[i]);
        }











    }
}
