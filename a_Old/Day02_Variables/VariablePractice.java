package a_Old.Day02_Variables;

public class VariablePractice {
    public static void main(String[] args) {
        /*
        Salary, federaltax, statetax, loan, ssn
         */

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;

        //salary after tax  = salary(1-sum of taxes)

        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1 - sumTaxes);
        System.out.println(salaryAfterTax);
    }
}
