package Day33_CustomClass;

public class Cat {
    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+" is sleeping");

    }
    public void eat(String catFood){
        System.out.println(name+" is eating "+catFood);

    }
    public void drink(String drink){
        System.out.println(name+" is eating "+drink);

    }

    public void setCatInfo(String catBreed, String catColor, int catAge, String catName){
        breed=catBreed;
        color=catColor;
        age=catAge;
        name=catName;
    }
    public String toString(){
        return name+" is our "+age+"-year old, "+breed+" cat that is "+color+"-colored.";
    }
}
