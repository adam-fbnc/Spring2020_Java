package Day18_DoWhile_NestedLoops;

public class NestedLoop3 {
    public static void main(String[] args) {
        for (char ch='a'; ch<='z'; ch++){
            for (char ch2='a'; ch2<=ch; ch2++){
                System.out.print(ch2+" ");
            }
            System.out.println();
        }
    }
}
