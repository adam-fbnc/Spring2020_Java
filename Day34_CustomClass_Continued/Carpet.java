package Day34_CustomClass_Continued;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;

    public void customerOrder(double cptWidth, double cptLength, double cptUnitPrice, boolean cptIsPersian){
     width=cptWidth;
     length=cptLength;
     unitPrice=cptUnitPrice;
     isPersian=cptIsPersian;
    }

    public double calcCost(){

        return (width+length)*unitPrice+(isPersian? 200:0);
    }

    public String toString(){
        return "This carpet measures "+length+" by "+width+", "
                +"and at $"+unitPrice+" per unit costs $"+calcCost()+"."
                +(isPersian?"\nOh, by the way, this carpet is Persian!":"");
    }
}
