package Day35_Static;

public class staticMethods {
    int         a=100;   // instance
    static int  b=200;   //static


    public static void main(String[] args) {
        staticMethods obj = new staticMethods();
        System.out.println(obj.a); // instance variable requires attachment to an object
        System.out.println(b);     // static variable can be used on its own
        System.out.println(staticMethods.b);// ---------//-----------same result as above line
        System.out.println(obj.b);// ---------//-----------same result as above line, but this one is preferred
    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }
}
