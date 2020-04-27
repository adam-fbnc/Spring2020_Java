package a_Old.Day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter company name: ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();
        //input.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        String theOutput = "";

        theOutput = "Full name: " + fullName + "\nJob title: " + jobTitle + "\nCompany name: "
                + companyName + "\nSSN: " + SSN + "\nSalary: " + salary;

        System.out.println(theOutput);
    }
}
