package a_Old.Day10_SwitchScanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {
        int num = 0;

        switch (2) {
            case 1:
                num += 3;
            case 3:
                num += 11;
            case 4:
                num += 2;
                // break;
            default:
                num -= 5;
                break;

        }
        System.out.println(num);

    }
}
