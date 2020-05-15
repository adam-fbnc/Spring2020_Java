package a_Old.Day22_Arrays_Loops;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] numbers={{9,8,7},{6},{5,4,3,2,1,0}};
        /*System.out.println(numbers[0].length);
        System.out.println(numbers[1].length);
        System.out.println(numbers[2].length);
        */



        for (int k=0;k<numbers.length; k++){
            for (int i=0;i<numbers[k].length; i++){
                System.out.print(numbers[k][i]);
            }
            System.out.println("");
        }

        for (int k=numbers.length-1;k>=0; k--){
            for(int i=numbers[k].length-1;i>=0; i--){
                System.out.print(numbers[k][i]+" ");
            }
        }
    }
}
