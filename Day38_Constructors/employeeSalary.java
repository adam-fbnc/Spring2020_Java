package Day38_Constructors;

public class employeeSalary {
    public static void main(String[] args) {
        SalaryCalculator emp1= new SalaryCalculator(50,40,0.0825,0.2);
        System.out.println(emp1);

        SalaryCalculator emp2= new SalaryCalculator(62,40,0.0875,0.26);
        System.out.println(emp2);
    }
}
