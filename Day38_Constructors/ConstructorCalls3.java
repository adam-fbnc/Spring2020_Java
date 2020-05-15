package Day38_Constructors;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(9);//in argument
        System.out.println("default");
    }

    public ConstructorCalls3(int a){
//        this();
        System.out.println("Int argument");
    }
    public ConstructorCalls3(String str){

    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }
}
