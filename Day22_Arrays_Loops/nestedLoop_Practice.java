package Day22_Arrays_Loops;

public class nestedLoop_Practice {
    public static void main(String[] args) {


        int[][] numbers ={{1,2,3},
                        {4,5,6,7,8,9},
                        {10,11,12,13,14},
                        {15,16,17,18,19,20,21}
                        };
        for(int i = 0;  i < numbers.length; i++){

            for(int k=0;k<numbers[i].length;k++){
                if((numbers[i][k])%2==0){
                    System.out.print(numbers[i][k]+" ");
                }
            }
        }
    }
}
