package Day34_CustomClass_Continued;

public class Pizza {
    String size;
    int cheeseTop;
    int pepTop;

    public void customizeOrder(String pizzaSize, int pizzaChTop, int pizzaPepTop){
        size=pizzaSize;
        cheeseTop=pizzaChTop;
        pepTop=pizzaPepTop;
    }

    public double calcCost(String pizzaSize, int pizzaChTop, int pizzaPepTop){
        int dough =pizzaSize.equalsIgnoreCase("small")? 10:
                pizzaSize.equalsIgnoreCase("medium")? 12:
                pizzaSize.equalsIgnoreCase("large")?14:0;
        return dough+pizzaChTop+pizzaPepTop*1.5;

    }
}
