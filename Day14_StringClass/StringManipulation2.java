package Day14_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
        String z1="Tiger";
        String z2 = new String("Tiger");
        String z3="Tiger";

        System.out.println(z1==z2);
        System.out.println(z1==z3);
        System.out.println(z1.equals(z2));

    }
}
