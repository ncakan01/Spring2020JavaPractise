package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("VA","BOA",100000,true);

        Offer offer2 = new Offer();
        offer2.setInfo("KY","CAPITALONE",120000,false);

        Offer offer3 = new Offer();
        offer3.setInfo("MD","Chase",95000,true);

        Offer offer4 = new Offer();
        offer4.setInfo("BY" ,"google",115_000,false);

        Offer [] offers={offer1 , offer2 , offer3, offer4};


        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
        //Accept.addAll(Arrays.asList(offers));
       // System.out.println(Accept);
        String  myLocation = "CA";

        Accept.removeIf(( each -> each.salary < 100000 ||  each.isFullTime == false || !each.location.equals("VA")));  // we remove the offer if it's less than 100K or not full time
//Accept.removeIf(  p ->  p.salary < 100000 ||  p.isFullTime == false || !p.location.equals(myLocation)  ); // we remove the offer if it's less than 100K or not full time

        Accept.removeIf(p -> p.salary<10000);
        Accept.removeIf(p -> p.location.equals(myLocation));
        Accept.removeIf(p -> p.isFullTime==false);

        System.out.println(Accept.size());

        for (Offer eachOffer : Accept) {
            System.out.println(eachOffer);

        }


    }
}
