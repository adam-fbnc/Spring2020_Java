package Day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class circleObject {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);

        Circle c1=new Circle(5.5);
        System.out.println(c1);
    }
}
