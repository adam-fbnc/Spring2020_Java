package Day23_Methods;

public class Methods_Practice {
    public static void helloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    public static void tasks() {
        System.out.println("Hello Cybertek");
        helloWorld();
        System.out.println("Hello Batch 18");
        helloWorld();
        System.out.println("Hello Saim");
        helloWorld();
    }

    public static void main(String[] args) {
        tasks();
    }
}
