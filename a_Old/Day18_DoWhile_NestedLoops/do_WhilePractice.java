package a_Old.Day18_DoWhile_NestedLoops;

public class do_WhilePractice {
    public static void main(String[] args) {
        int num = 0;

        do{
            if(num%2==0) {
                System.out.print(num + " ");
            }
            num++;
        }while (num<=100);
    }
}
