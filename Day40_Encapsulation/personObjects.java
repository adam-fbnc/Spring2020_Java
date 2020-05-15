package Day40_Encapsulation;

public class personObjects {
    public static void main(String[] args) {
        Person Zarina= new Person("Zarina");
        System.out.println(Zarina.name);
//        System.out.println(Zarina.SSN); -- causes compile error as SSN is a private veriable.
        Zarina.setSSN(987654);
        System.out.println("Zarina's SSN: "+Zarina.getSSN());
        Zarina.setID(123);
        System.out.println("Zarina's ID: "+Zarina.getID());

        Person Adam = new Person("Adam");
        Adam.setSSNAndID(987654,123);
        System.out.println(Adam.getSSN());
        System.out.println(Adam.getID());
    }
}
