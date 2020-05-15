package Day34_CustomClass_Continued;

import java.util.ArrayList;
import Day34_CustomClass_Continued.Tester;

public class ScrumTeam {
    ArrayList<Tester>   testersTeam=new ArrayList<>();
    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }
    public void fireTester(long empID){
        testersTeam.removeIf(p-> p.empID==empID);
    }
}
