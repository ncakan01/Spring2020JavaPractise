package day21_MultiDimensionalArrays;

public class Zoo {

    public static void main(String[] args) {

        String [] wildAnimals={"Tiger" , "Lion" , "Monkey" , "Turtle" , "Corcodile"};

        String [] Birds={"Eagle ", "Ducks" ,"Peacock" , "Chicken"};

        String [][] zoo = { wildAnimals ,Birds};

         String kfc = zoo[1][3];  // "Chicken"

        System.out.println(kfc);

        System.out.println("==============================================");

        for ( String eachBirds :  zoo[1]) {  //4

            if (eachBirds.equals("Chicken")) {
                continue;
            }

            System.out.println(eachBirds);

        }
        System.out.println("==================================================");
        for (  String each: zoo[0]  ) { //5
            if(each.equals("Turtle")) {
                continue;
            }
            System.out.println(each);

        }



        }

    }

