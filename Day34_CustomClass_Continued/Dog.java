package Day34_CustomClass_Continued;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String DogBreed, String DogSize, int DogAge, String DogColor, String DogName){
        breed=DogBreed;
        size=DogSize;
        age=DogAge;
        color=DogColor;
        name=DogName;

    }

    public String toString(){
        return "Dog name: "+name+", breed: "+breed+", size: "+size+", color: "+color+", age: "+age ;

    }

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }
}
