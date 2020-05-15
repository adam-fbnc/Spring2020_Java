package Day38_Constructors;

import static Day25_MethodsRecap.return_statement.method2;

public class ConstructorCalls {
    public ConstructorCalls(){
        method1();
        method2();
        
    }

    public ConstructorCalls(int a){
        this();
    }

    public static void method1(){
        method2();
//        ConstructorCalls(); Does not compile
    }

}
