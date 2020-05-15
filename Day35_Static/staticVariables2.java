package Day35_Static;

public class staticVariables2 {
    int insVariable;
    static int staticVariable; //static

    public static void main(String[] args) {
        int a1=100; //local variable

        staticVariables2 obj1= new staticVariables2();
        obj1.insVariable=300;
        obj1.staticVariable=400;

        staticVariables2 obj2= new staticVariables2();

        System.out.println(obj1.insVariable);
        System.out.println(obj2.insVariable);
        System.out.println(obj1.staticVariable); //a3 is shared by both obj1 and obj2
        System.out.println(obj2.staticVariable); //a3 is shared by both obj1 and obj2
    }
}
