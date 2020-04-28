package a_Old.Day16_ForPractice;

public class ContinueStatement {
    public static void main(String[] args) {
        for(char ch='Z'; ch>='A'; ch--){
            if(ch=='Y'||ch=='H'||ch=='J'||ch=='D'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();

    }
}
