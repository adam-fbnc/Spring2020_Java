package Day37_Constructors;

public class ConstructorIntro {
    public ConstructorIntro(int a){
        System.out.println("Constructor with paramter of int: "+a);
    }

    public static void main(String[] args) {
        ConstructorIntro obj = new ConstructorIntro(5);
        // default constructor that is automatically created by compiler

    }
}
