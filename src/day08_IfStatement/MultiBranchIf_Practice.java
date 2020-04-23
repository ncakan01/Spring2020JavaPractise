package day08_IfStatement;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {

        double score=95.5;

        boolean AGrade=score>=90 && score<=100;
        boolean BGrade=score>=80 && score<90;
        boolean CGrade=score>=70 && score<80;
        boolean DGrade=score>=60 && score<70;

        char garde =' ';


        if (AGrade){
            garde='A';
        }else if (BGrade){
            garde='B';
        }else if (CGrade){
            garde='C';
        }else if (DGrade){
            garde='D';
        }else {
            System.out.println("F");
        }
        System.out.println("Score "+ score+ " is :"+garde);
    }
}
