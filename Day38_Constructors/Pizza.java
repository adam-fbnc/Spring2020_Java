package Day38_Constructors;

public class Pizza {
    char size;
    int cheeseToppings;
    int pepperoniToppings;

    public Pizza(char size, int cheeseToppings, int pepperoniToppings){
        this.size=size;
        this.cheeseToppings=cheeseToppings;
        this.pepperoniToppings=pepperoniToppings;
    }

    public double calcCost(char size, int cheeseToppings, int pepperoniToppings){
        return (size=='s'? 10:size=='m'? 12:size=='l'? 14:0)+cheeseToppings+pepperoniToppings*1.5;
    }

    public String toString(){
        return "Your "+
                (size=='s'? "small":size=='m'? "medium":size=='l'? "large":"unknown")+
                "-size pizza with "+cheeseToppings+" cheese and "+
                pepperoniToppings+" pepperoni toppings costs: $"+calcCost(size, cheeseToppings, pepperoniToppings);
    }

}
