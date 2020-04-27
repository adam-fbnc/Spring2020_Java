package a_Old.Day08_IfStatements;

public class equalNumbers_MultiBranch {
    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;
        String result = " ";

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n2Equaln3 = n3 == n2 && n1 != n3;
        boolean n1Equaln3 = n1 == n3 && n1 != n3;
        boolean noneEqual = !(n1 == n2 || n2 == n3);
        // boolean noneEqual2 = n1 != n2 && n1 != n3 && n2 != n3;
        //System.out.println(noneEqual);
        //System.out.println(noneEqual2);

        if (n1Equaln2) {
            result = "n1 equals n2";
        } else if (n2Equaln3) {
            result = "n2 equals n3";
        } else if (n1Equaln3) {
            result = "n1 equals n3";
        } else if (noneEqual) {
            result = "None of the variables are equal";
        } else {
            result = "All variables are equal";
        }

        System.out.println(result);


    }
}
