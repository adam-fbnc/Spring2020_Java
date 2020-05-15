package Day33_CustomClass;

public class Car {
    int year;
    String Brand;
    String Model;
    String Color;

    public void start(){
        System.out.println(Brand+" is started");
    }
    public void drive(){
        System.out.println("Driving "+Brand+" "+Model);

    }
    public void getCarInfo(){
        System.out.println(year+" "+Brand+" "+Model);
    }

    public void setCarInfo(String carBrand, String carModel, int caryear, String color){
        Brand=carBrand;
        Model=carModel;
        year=caryear;
        Color=color;
    }

    public String toString(){
        String result = year+" "+Brand+" "+ Model+" "+Color;
        return result;
    }
    public static void main(String[] args) {

    }
}
