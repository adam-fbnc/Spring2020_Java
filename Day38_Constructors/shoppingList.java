package Day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class shoppingList {
    public static void main(String[] args) {
        Item item1=new Item("Corn",0.25,20);
        Item item2=new Item("Beef",8.25,4);
        Item item3=new Item("Tomatoes",1.49,4);
        Item item4=new Item("Canvas",2,10);
        Item item5=new Item("Apron",8,1);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        ArrayList<Item> items = new ArrayList<>(Arrays.asList(item1, item2, item3));
        double totalCost=0;

        for (Item each:             items) {
            totalCost +=each.calcCost();
        }
        System.out.println(totalCost);
    }
}
