package Day34_CustomClass_Continued;

import java.util.ArrayList;
import java.util.Arrays;

public class BofA {
    public static void main(String[] args) {
        Tester t1 = new Tester();
        t1.setTesterInfo("Madina", 123, "QA", 200000);
        Tester t2 = new Tester();
        t2.setTesterInfo("Venera", 345, "Senior SDET", 150000);
        Tester t3 = new Tester();
        t3.setTesterInfo("Sha", 567, "SDET", 120000);
        Tester t4 = new Tester();
        t4.setTesterInfo("John", 789, "Uber Driver", 60000);


        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(t1,t2,t3,t4));

        testers.removeIf(p->!p.JobTitle.contains("SDET"));

        double totalBudget = 0;
        for (Tester each: testers
             ) {
            totalBudget+=each.Salary;
        }
        System.out.println(totalBudget);
    }
}
