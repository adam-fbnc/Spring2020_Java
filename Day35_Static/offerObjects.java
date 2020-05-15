package Day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class offerObjects {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOA", 100000, true);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 120000, false);

        Offer offer3 = new Offer();
        offer2.setInfo("MD", "Chase", 95000, true);

        Offer offer4 = new Offer();
        offer2.setInfo("BayArea", "Google", 115000, false);

        Offer[] offers={offer1,offer2,  offer3, offer4};

        String myLocation = "VA";

        ArrayList<Offer>    Accept=new ArrayList<>(Arrays.asList(offers));
        Accept.removeIf(p-> p.salary<100000||p.isFullTime==false);

        System.out.println(Accept.size());
        for(Offer eachOffer:Accept){
            System.out.println(eachOffer);
        }

        ArrayList<Offer>    Accept2=new ArrayList<>(Arrays.asList(offers));
        System.out.println(Accept2);
        Accept2.removeIf(p-> p.salary<100000||p.isFullTime==false||p.location.equalsIgnoreCase(myLocation));

        System.out.println(Accept2.size());
        for(Offer eachOffer:Accept2){
            System.out.println(eachOffer);
        }
    }
}
