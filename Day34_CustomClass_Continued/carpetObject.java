package Day34_CustomClass_Continued;
import Day33_CustomClass.Car;
import Day34_CustomClass_Continued.Carpet;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObject {
    public static void main(String[] args) {
        Carpet[]    carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        carpets[0].customerOrder(7,8.5,20,true);
        carpets[1].customerOrder(10,15,30,false);
        carpets[2].customerOrder(9,20,15,true);
        carpets[3].customerOrder(20,18,25,false);
        carpets[4].customerOrder(35,45,35,true);

        for (Carpet eachCpt:carpets
             ) {
            System.out.println(eachCpt);
        }
        ArrayList<Carpet> persCarpets= new ArrayList<>();

        for (Carpet eachCarpet: carpets
             ) {
            if(eachCarpet.isPersian){
                persCarpets.add(eachCarpet);
            }
        }
        System.out.println("\nThere are "+persCarpets.size()+" Persian carpets on hand.");
        for (int i = 0; i < persCarpets.size(); i++) {
            System.out.println(persCarpets.get(i).calcCost());

        }

        ArrayList<Carpet> regCarpets= new ArrayList<>(Arrays.asList(carpets));
        regCarpets.removeAll(persCarpets);
        System.out.println("And there are "+regCarpets.size()+" Persian carpets on hand.");

        for (int i = 0; i < regCarpets.size(); i++) {
            System.out.println(regCarpets.get(i).calcCost());

        }
    }
}
