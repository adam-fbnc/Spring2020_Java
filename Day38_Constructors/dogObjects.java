package Day38_Constructors;

public class dogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        Dog dog2=new Dog("Lord");
        Dog dog3=new Dog("King", "Bulldog", 10);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
