package a_Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_2_Times {
    public static void main(String[] args) {
        {
            ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,5,3,7));
            System.out.print(twoTimes(arr));
        }

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrList){
        ArrayList<Integer> newList=new ArrayList<>();
        for(int i=0; i<arrList.size();i++){
            newList.add(arrList.get(i));
            newList.add(arrList.get(i));
        }
    return newList;
    }
}
