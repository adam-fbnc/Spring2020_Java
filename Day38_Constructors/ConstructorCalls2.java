package Day38_Constructors;
public class ConstructorCalls2 {
    public ConstructorCalls2() {
        System.out.println("Default constructor");
    }
    public ConstructorCalls2(int a){
        this();//Refers to Default constructor
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls2(String str){
        this(10); //default constructor call, with int argument
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("Hello");
//        System.out.println(obj);
    }

/*    public String toString(){
        return obj+"";
    }*/
}
