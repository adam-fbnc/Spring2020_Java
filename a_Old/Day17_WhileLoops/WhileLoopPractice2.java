package a_Old.Day17_WhileLoops;
/*
Write a program using while loop, that calculates the sum of the even numbers between  0 and 10
 */
public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int i=1;
        int total=0;
        while(i<11){
            if(i%2==0){
                total+=i;
            }
            i++;

        }
        System.out.println(total);
    }
}
