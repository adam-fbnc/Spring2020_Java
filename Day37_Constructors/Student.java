package Day37_Constructors;

public class Student {
    //name, age, gender (M/F), university

    String name;
    int age;
    char gender;
    String university;

    public Student(String name, int age, char geneder, String university){
        this.name=name;
        this.age=age;
        this.gender=geneder;
        this.university=university;
    }

    public void setInfo(String name, int age, char geneder, String university){
        this.name=name;
        this.age=age;
        this.gender=geneder;
        this.university=university;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }
}
