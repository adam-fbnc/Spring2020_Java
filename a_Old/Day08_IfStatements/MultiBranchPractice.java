package a_Old.Day08_IfStatements;

public class MultiBranchPractice {
    public static void main(String[] args) {
        double score = 65.5;

        boolean AGr = score >= 90 && score <= 100;
        boolean BGr = score >= 80 && score < 90;
        boolean CGr = score >= 70 && score < 80;
        boolean DGr = score >= 60 && score < 70;
        boolean FGr = score < 60;

        char grade = ' ';

        if (AGr) {
            grade = 'A';

        } else if (BGr) {
            grade = 'B';
        } else if (CGr) {
            grade = 'C';
        } else if (DGr) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score is " + score + "and grade is " + grade);

    }
}
