package Day38_Constructors;

public class pizzaObjects {
    public static void main(String[] args) {
        Pizza combo=new Pizza('l',3,3);
        Pizza meats=new Pizza('s',0,6);
        Pizza cheese=new Pizza('m',6,0);

        System.out.println(combo);
        System.out.println(meats);
        System.out.println(cheese);
    }
}
