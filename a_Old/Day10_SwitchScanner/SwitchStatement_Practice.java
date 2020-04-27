package a_Old.Day10_SwitchScanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {
        int num = 4;

        switch (num) {
            case 1:
                System.out.println("Monday");
                break; // case closed and switch statement is exited immediately
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
