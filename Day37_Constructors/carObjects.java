package Day37_Constructors;

public class carObjects {
    public static void main(String[] args) {
        Car car1=new Car("Toyota", "Corolla", 2020,22000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        Car car2=new Car("Mercedes", "C300", 2018,45000);
        System.out.println(car1+"\n"+car2);
    }
}
