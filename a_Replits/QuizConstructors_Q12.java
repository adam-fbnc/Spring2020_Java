package a_Replits;

public class QuizConstructors_Q12 {
    public static String name = "Osman";

    public QuizConstructors_Q12(){
        name="Hilal";
    }
    {name="Marionela";}

    static {
        name="Madina";
    }

    public static void main(String[] args) {
        QuizConstructors_Q12 obj=new QuizConstructors_Q12();
        System.out.println(name);
    }
}
