package Day33_CustomClass;

import java.util.Arrays;

public class carObjects {
    public static void main(String[] args) {
        Car car1= new Car();
            car1.Brand = "BMW";
            car1.Model = "X5";
            car1.year = 2020;
            car1.Color = "Red";
        System.out.println(car1.Color);
        System.out.println(car1.Brand);

        Car car2 = new Car();
            car2.Brand = "Toyota";
            car2.Model = "Corolla";
            car2.year = 2020;
            car2.Color = "White";

        Car car3 = new Car();
            car3.Brand = "Mercedes";
            car3.Model = "C Class";
            car3.year = 2020;
            car3.Color = "Black";

        car3.getCarInfo();
        car1.drive();
        car2.start();

        Car car4 = new Car();
            car4.setCarInfo("Acura", "MDX", 2019, "Space Gray");

        System.out.println("======================================================");
        Car[] cars={car1,car2,car3,car4};

        for (int i = 0; i < cars.length; i++) {
            cars[i].getCarInfo();

        }
        System.out.println("======================================================");

        for (Car each: cars
             ) {
            each.getCarInfo();

        }
        System.out.println(Arrays.toString(cars));
    }
}
