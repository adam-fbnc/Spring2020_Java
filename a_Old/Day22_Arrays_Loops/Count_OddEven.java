package a_Old.Day22_Arrays_Loops;

public class Count_OddEven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int odds=0;
        int evens=0;
        for (int each: arr) {
            if(each%2==0){
                evens++;
                continue;
            }odds++;
        }
        System.out.println("Evens- "+ evens+", odds - "+odds);

    }
}
