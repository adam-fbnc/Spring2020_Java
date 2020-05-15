package Day36_StaticBlock;

import Day34_CustomClass_Continued.Tester;

public class StaticBlock4 {
    static String name;
    static Tester tester1= new Tester();

    static {
        name="Cybertek School";
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
    }
}
