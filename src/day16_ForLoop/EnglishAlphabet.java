package day16_ForLoop;

public class EnglishAlphabet {
    /*
    5. Write a program that will print out all letters in English alphabet in ascending order

	6. Write a program that will print out all letters in English alphabet in descedning order
     */
    public static void main(String[] args) {
        for (char ch ='A'; ch<='z'; ch++){
            System.out.println(ch);
        }
        System.out.println();

        for(char ch ='Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }



    }
}
