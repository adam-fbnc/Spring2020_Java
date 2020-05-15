package Day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setCatInfo("Siamese", "Silver", 11,"Dasha");
        System.out.println(cat1.toString());

        Cat cat2=new Cat();
        cat2.setCatInfo("Egyptian","Biege",4,"Kofi");

        Cat cat3=new Cat();
        cat3.setCatInfo("Tabby", "pink",8,"Murka");

        ArrayList<Cat>  catList=new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i));
        }
    }
}
