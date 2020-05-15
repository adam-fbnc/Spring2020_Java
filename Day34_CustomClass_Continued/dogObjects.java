package Day34_CustomClass_Continued;
import Day34_CustomClass_Continued.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setDogInfo("Husky","Small",4,"Black & White","Ghost");
        Dog dog2=new Dog();
        dog2.setDogInfo("Alabay","Extra large",5,"Brown","Ajdar");
        Dog dog3=new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");
        Dog dog4=new Dog();
        dog4.setDogInfo("Pomeranian", "Small",4, "Gray", "Ernie");
        Dog dog5=new Dog();
        dog5.setDogInfo("German Shepard", "Medium",2, "Mixed", "Lil");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("========================================================");

        ArrayList<Dog>  puppies= new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        for (int i = 0; i < puppies.size(); i++) {
            System.out.println(puppies.get(i));
        }
        puppies.removeIf(p->p.age>2);
        System.out.println("========================================================");

        for (int i = 0; i < puppies.size(); i++) {
            System.out.println(puppies.get(i));
        }


    }
}
