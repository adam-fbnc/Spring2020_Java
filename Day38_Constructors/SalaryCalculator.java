package Day38_Constructors;
/*    Create class called SalaryCalculator
            instance variables:
    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
    add a constructor can initialize those fields
    instance methods:
    salary(): returns the total salary as double
    stateTax(): retuns the total state tax as double
    federalTax(): retuns the total federal tax as double
    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by
        salaryAftertax(): retuns the salary after tax as double*/

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHour;
    double statTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double statTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHour=weeklyHour;
        this.statTaxRate=statTaxRate;
        this.federalTaxRate=federalTaxRate;
    }
    public double salary()      {        return hourlyRate*weeklyHour*52;    }
    public double stateTax()    {        return salary()*statTaxRate;    }
    public double federalTax()  {        return  salary()*federalTaxRate;    }
    public double salaryAfterTax(){        return salary()-stateTax()-federalTax();    }

    public String toString(){
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHour+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax()+"\n";
    }
}
