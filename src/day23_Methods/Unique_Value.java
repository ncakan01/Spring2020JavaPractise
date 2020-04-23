package day23_Methods;
/*
1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class Unique_Value {
    public static void main(String[] args) {

        String [] arr= {"A", "E", "B", "C", "D"};


        for (String each2:arr) {


            int count =0;
            for (String  each :arr) {

                if (each.equals(each2)){
                    count++;
                }

            }
            if (count==1 ){   // if the character is unique

                System.out.println(each2);

            }

        }

/*
        //"A"

        int count =0;

        for (String  each :arr) {

            if (each.equals("A")){
                count++;
            }

        }
        //System.out.println(count);

        if (count==1 ){   // if the character is unique

            System.out.println("A");

        }

 */

    }
}
