package Day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }

    public Dog(String name, int age){
        this.name=name;
        breed="unknown";
        this.age=age;
    }

    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
        age=0;
    }

    public Dog(String name){
        this.name=name;
        breed="unknown";
        age=0;
    }
    public Dog(){
        name="unknown";
        breed="unknown";
        age=0;
    }

    public String toString(){
        return "Name: "+name+
                "\nBreed: "+breed+
                "\nAge: "+age;
    }
}
