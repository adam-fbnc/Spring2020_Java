package Day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "CyberTekSchool@gmail.com";

        boolean result = gmail.equals(userinputGmail);
        boolean res1= gmail.equals(userinputGmail.toLowerCase());
        boolean res2= gmail.equalsIgnoreCase(userinputGmail);

        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);
    }
}
