package Day24_Methods;

public class BirthYear {
    public static void Age(short birthYr){
        short currentYr=2020;
        short age = (short)(currentYr-birthYr);
        if (birthYr<=currentYr){
            System.out.println(age);
        }else{

        }
    }

    public static void main(String[] args) {
        Age((short)1980);
    }
}

