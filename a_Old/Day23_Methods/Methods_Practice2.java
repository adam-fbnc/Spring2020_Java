package a_Old.Day23_Methods;

public class Methods_Practice2 {
    public static void helloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    public static void printStuff(String stuff) {
        System.out.println("Hello "+stuff);
    }

    public static void tasks() {
        String[] stuff={"Cybertek","Batch 18", "Saim"};
        for (String each:stuff) {
            printStuff(each);
            helloWorld();
        }


    }

    public static void main(String[] args) {
        tasks();
    }
}
