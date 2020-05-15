package Day39_AccessModifiers;

public class Car {
    String brand, model;
    int year;
    double price;

    public Car(String brand){
        this.brand=brand;
        year=0;// unnecesary, because default value is '0' anyway. If it were string, then
        price=0;// the value would have been 'null' if left unassigned.
    }
    public Car(String brand, String model){
//        this.brand=brand;
        this(brand);
        this.model=model;
    }
    public Car(String brand, String model, int year){
/*        this.brand=brand;
        this.model=model;*/
        this(brand,model);
        this.year=year;
    }
    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price=price;
    }

    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
/*        return "Brand: "+brand+
                "\nModel: "+model+
                "\nYear: "+year+
                "\nPrice: $"+price;*/
    }
}
