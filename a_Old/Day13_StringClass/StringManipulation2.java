package a_Old.Day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";
        String schoolName = str.substring(0,8);
        String fullName ="Kuzzat Altay";
        String fistName = fullName.substring(0,6);
        String lastName = fullName.substring(7,12);

        System.out.println(fistName);
        System.out.println(lastName);

        String s2 ="I like C# Programming C# C#";
        s2=s2.replace("C#", "Java");

        System.out.println(s2);

        String name = "COVID 18";
        name =name.replace("8","9");
        System.out.println(name);

        String q1= "I like C#, C# is fun, C# is cool";
        q1=q1.replaceFirst("C#","Java");
        System.out.println(q1);



    }
}
