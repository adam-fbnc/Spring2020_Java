package Day34_CustomClass_Continued;

public class Tester {
    String name;
    long empID;
    String JobTitle;
    double Salary;

    public void setTesterInfo(String name,long empID, String JobTitle, double Salary){
        this.name=name;
        this.empID=empID;
        this.JobTitle=JobTitle;
        this.Salary=Salary;
    }

    public String toString(){
        return "Name: "+name+", employee ID: "+empID+", job title: "+JobTitle+", salary: $"+Salary;
    }
}
