package day21_MultiDimensionalArrays;

public class ScrumTeam {

    public static void main(String[] args) {
        String [] DevTeam={"Zeynep" , "Haider" , "Jpovid","muhtar"};
        String [] Testers={"Rahman" , "Aishan" , "Osman" , "Ali"};
        String [] PO = {"Barzy" ,"Donald"};

        String [][] ScrumTeam =  { DevTeam ,Testers ,PO};

        String [] TestersTeam2={"Nur" , "Lina" , "zEKERIYA" , "Ali"};



                 ScrumTeam[0][3] =" Jean";
        System.out.println(ScrumTeam[0][3]);

        ScrumTeam[1]=TestersTeam2;

        String info = ScrumTeam[1][2];
        System.out.println(info);

        System.out.println("==============================================================================");

        for (String eachEmployee  : ScrumTeam[0]) {
            System.out.println(eachEmployee);

        }
        for (String eachEmployee  : ScrumTeam[1]) {
            System.out.println(eachEmployee);

        }

        System.out.println("=====================================================================================");

        for (String eachEmployee  : ScrumTeam[2]) {
            System.out.println(eachEmployee);

        }

        System.out.println("=============================================================================");

        System.out.println(ScrumTeam[2][1]);







    }
}
