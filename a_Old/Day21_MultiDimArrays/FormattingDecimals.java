package a_Old.Day21_MultiDimArrays;

import java.text.DecimalFormat;

public class FormattingDecimals {
    public static void main(String[] args) {
        DecimalFormat DF= new DecimalFormat("0.00");
        double a =10/3;
        System.out.println(a);
        System.out.println(DF.format(a));
    }
}
