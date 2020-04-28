package day21_MultiDimensionalArrays;

public class Logest_Shortest_Words {
/*
    2. write a program that can return the logest string of text from an array
    3. write a program that can return the shortest string of text from an array

 */

    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxlengthString= names[0].length();//4
        int minlengthString= names[0].length();

        String longestword=names[0]; // baslangic
        String shortestword=names[0];

        for (int i=0; i<names.length; i++){
            if (names[i].length()>maxlengthString){
                maxlengthString=names[i].length();
                longestword=names[i];
            }

            if (names[i].length()<maxlengthString) {
                minlengthString = names[i].length();
                shortestword = names[i];
            }
        }
        System.out.println(longestword);
        System.out.println(maxlengthString);
        System.out.println(shortestword);
        System.out.println(minlengthString);


    }
}
