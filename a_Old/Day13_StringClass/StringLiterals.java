package a_Old.Day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1 = "Cat"; // String pool
        String str2 = new String("Cat");//Java Heap

        System.out.println(str1+ " : "+str2);
        System.out.println(str1 ==str2); // since these are two different objects the result is 'false';

        String str3 = "Cat"; //String pool

        System.out.println(str1==str3); // true

        String str4= new String("Cat");
        System.out.println(str2==str4); //two independent objects, false

        String s1 = "Java"; //String Pool, immutable we cannot modify it
        s1 = "JavaScript"; //new object will be created in memory




    }
}
