package a_Old.Day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {
        String str = "I like Java programming";
        int num1= str.indexOf("J");

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        //             0123456789
        int firstS=str2.indexOf("s");
        int secondS =str2.indexOf("s ");
        int secondS2=str2.indexOf("is")+1;
        int thirdS =str2.lastIndexOf("s");

        System.out.println(firstS);
        System.out.println(secondS);
        System.out.println(secondS2);
        System.out.println(thirdS);

        String fullN = "Kuzzat Altay";
        String fName=fullN.substring(0,fullN.indexOf(" "));
        String lName = fullN.substring(fullN.indexOf(" ")+1);

        System.out.println(fName);
        System.out.println(lName);


    }
}
