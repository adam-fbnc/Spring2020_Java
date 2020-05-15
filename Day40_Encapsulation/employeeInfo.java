package Day40_Encapsulation;

public class employeeInfo {
    private double Salary;
    private long SSN;
    private int ID;
    private String Address;

    public static String companyName = "Bank of America";

    public double getSalary(){
        return Salary;
    }
    public long getSSN(){
        return SSN;
    }
    public int getID(){
        return ID;
    }
    public String getAddress(){
        return Address;
    }

    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public void setSSN(long SNN){this.SSN=SNN;}
    public void setID(int ID){this.ID=ID;}
    public void setAddress(String Address){this.Address=Address;}


}
