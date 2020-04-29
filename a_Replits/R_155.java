package a_Replits;

public class R_155 {
    public static void main(String[] args) {
        int num =2;

        int a=1;
        int b=1;
        int c=0;

        if(num==1){
            c=0;
        }else if(num==2){
            c=1;
        }else{
            for(int i=3; i<=num; i++){
                c=a+b;
//                System.out.println("a="+a);
//                System.out.println("b="+b);
//                System.out.println("c="+c);
                a=b;
                b=c;

            }
        }
        System.out.println(c);
    }

}
