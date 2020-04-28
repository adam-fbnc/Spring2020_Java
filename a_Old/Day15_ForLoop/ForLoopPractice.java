package a_Old.Day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        String result ="";
        String resultEven ="";
        for (int num=2; num<101; num+=2){
            result = result +(num-1)+" ";
            resultEven=resultEven+num+" ";
        }
        System.out.println(result);
        System.out.println(resultEven);
    }
}
