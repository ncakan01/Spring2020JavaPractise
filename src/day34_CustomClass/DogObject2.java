package day34_CustomClass;

public class DogObject2 {
    public static void main(String[] args) {
        String food1="Chicken";
        String food2="Fish";

        String drink1="milk";
        String drink2="coffe";

        String toy1="Ps4";
        String toy2="Piano";

        String subject1="java";
        String subject2="pyton";

        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay","Extra big", 5,"Brown","Ajdar");
        Dog dog2 = new Dog();
        dog2.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");

        dog1.eating(food1);
        dog2.eating(food2);

        dog2.drinking(drink2);
        dog1.drinking(drink1);

        dog1.playing(toy1);
        dog2.playing(toy2);

        Dog dog3= new Dog();
        dog3.setDogInfo("Poodle","Miniature", 5,"Brown","Lucky");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("================================================================");

        Dog [] dogPark = {dog1,dog2,dog3,dog4};

        for (int i = 0; i<dogPark.length; i++){
            dogPark[i].eating("Chicken");
        }
        for (Dog each : dogPark) {
            each.drinking("water");

        }
        for (Dog each : dogPark) {
            each.playing("football");

        }
        for (int i = 0; i<dogPark.length; i++){
            dogPark[i].studying(subject1);
        }











    }
}
