package a_Old.Day18_DoWhile_NestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int j = 1; j <= 12; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int z = 12; z >= 1; z--) {
            for (int x = 1; x <= z; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
