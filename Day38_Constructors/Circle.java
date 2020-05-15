package Day38_Constructors;

public class Circle {
    static double PI = 3.14;
    double radius;
    double diameter;

    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
    }

    public double area(){return PI*radius*radius;}
    public double perimeter(){return PI*diameter;}

    public String toString(){
        return "Circle radius: "+radius+
                ", Circle diameter: "+diameter+
                ", Circle area: "+area()+
                ", Circle perimeter: "+perimeter();
    }
}
