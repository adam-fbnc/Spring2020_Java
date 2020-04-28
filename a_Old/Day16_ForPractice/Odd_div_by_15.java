package a_Old.Day16_ForPractice;

public class Odd_div_by_15 {
    public static void main(String[] args) {
        String result ="";
        for(int i=1; i<101; i+=1){
            if(i%2==1 && i%15==00){
                result=result+i+" ";

            }
        }
        System.out.println(result);
    }
}
