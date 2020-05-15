package Day34_CustomClass_Continued;

public class dogObjects2 {
    public static void main(String[] args) {

        String food1="Chicken";
        String food2="Fish";
        String drink1="milk";
        String drink2="coffee";
        String toy1="chess";
        String toy2="piano";
        String toy3="poker";

        Dog dog1=new Dog();
        dog1.setDogInfo("Husky","Small",4,"Black & White","Ghost");
        Dog dog2=new Dog();
        dog2.setDogInfo("Alabay","Extra large",5,"Brown","Ajdar");
        Dog dog3=new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");



        dog1.eating(food1);

        System.out.println("=======================================================");
        Dog[]   dogPark={dog1,dog2,dog3};

        for (int i = 0; i < dogPark.length; i++) {
            dogPark[i].eating(food1);

        }
        for (Dog eachDog:dogPark
             ) {
            eachDog.drinking(drink1);
        }
        for (Dog eachDog:dogPark
        ) {
            eachDog.playing(toy3);
        }
    }
}
