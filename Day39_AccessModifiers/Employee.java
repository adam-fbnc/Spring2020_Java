package Day39_AccessModifiers;

public class Employee {
    String name;
    String jobTitle;
    long ID;
    double salary;
    char gender;

    public Employee(String name){        this.name=name;    }

    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle=jobTitle;
    }

    public Employee(String name, String jobTitle, long ID){
        this(name, jobTitle);
        this.ID=ID;
    }

    public Employee(String name, String jobTitle, long ID, double salary){
        this(name, jobTitle,ID);
        this.salary=salary;
    }

    public Employee(String name, String jobTitle, long ID, double salary, char gender){
        this(name, jobTitle,ID, salary);
        this.gender=gender;
    }

    public String toString(){
        return "Name: "+name+
                "\nJob Title: "+jobTitle+
                "\nEmployee ID: "+ID+
                "\nSalary: $"+salary+
                "\nGender: "+gender+"\n";
    }
}
