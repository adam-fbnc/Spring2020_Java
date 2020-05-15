package a_Replits;

import java.util.ArrayList;

public class R_190 {
    public static void main(String[] args)
    {
        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(4);
        intList.add(-6);
        intList.add(3);
        intList.add(-8);
        intList.add(0);
        intList.add(4);
        intList.add(3);
        intList.add(-3);
        intList.add(13);
        System.out.println(PosSum(intList));
    }
    public static ArrayList<Integer> PosSum(ArrayList<Integer> intList){
        ArrayList<Integer> newList=new ArrayList<>();
        int sum=0, count=0, item=0;
        for(int i=0; i<intList.size();i++){
            item=intList.get(i);
            if(item>0){
                sum+=item;
                newList.add(count,item);
                count++;
            }
        }
        newList.add(count,sum);
        return newList;
    }
}
