package day36_StatickBlock;

import OfficeHours.Developer;

public class HumanResource {

    static    Developer dev1;
    //dev1.setInfo("Namik ","Developer",120000,123);  always used the static block
    static    Developer dev2 = new Developer();
    static    Developer dev3 = new Developer();
    static    Developer dev4 = new Developer();
    static    Developer dev5 = new Developer();
    /*

    public static void main(String[] args) {
        dev1.setInfo("Namik ","Developer",120000,123);
    }
    Static block olmazsa calismiyor bize null degerini veriyor.
     */
    static {
        dev1 = new Developer();
        dev1.setInfo("Namik ","Developer",120000,123);
    }

}
