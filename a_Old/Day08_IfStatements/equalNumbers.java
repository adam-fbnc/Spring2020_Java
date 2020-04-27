package a_Old.Day08_IfStatements;

public class equalNumbers {
    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n2Equaln3 = n3 == n2 && n1 != n3;
        boolean n1Equaln3 = n1 == n3 && n1 != n3;

        boolean noneEqual = n1 != n2 && n1 != n3 && n2 != n3;
        boolean noneEqual2 = !(n1 == n2 || n2 == n3);

        System.out.println(noneEqual);
        System.out.println(noneEqual2);


    }
}
