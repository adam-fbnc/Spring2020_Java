package Day29_Wrapper_ArrayList;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str = "123";
        Integer a = Integer.valueOf(str);
        System.out.println(a);

        double b = Integer.valueOf(str);
        System.out.println(b);

        String str2="15.5";
        double d1=Double.parseDouble(str2); //double = double ~ none
        double d2=Double.valueOf(str2);     // double = Double ~ unboxing

        String r1="true";
        Boolean t1=Boolean.valueOf(r1); // **CAPITAL** Boolean, true
        //Boolean = Boolean ~ none

        boolean t2= Boolean.valueOf(r1); // **lower** 
    }
}
