package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffer {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setOfferInfo("VA","BOA",100000,true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("bA","Bsf",187000,false);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("CS","SDF",120000,true);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("HJ","GYA",90000,false);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("GHJ","BCFHJ",80000,true);

        Offer [] offers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> list = new ArrayList<>(Arrays.asList(offers));

        list.removeIf(p->p.isFullTime==false);
        list.removeIf(p-> p.location=="CS");
        list.removeIf(p-> p.salary>100000);


        for (Offer each : list) {
            System.out.println(each);


        }




    }
}
