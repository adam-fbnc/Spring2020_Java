package Day34_CustomClass_Continued;

import java.util.ArrayList;
import java.util.Arrays;

public class studentObjects {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.setStudentInfo("Adam","England",34,3.5,'M',true);
        Student st2=new Student();
        st2.setStudentInfo("Mike","German",30,3.0,'M',false);
        Student st3=new Student();
        st3.setStudentInfo("Johnny Guitar", "US",40,4,'M',false );
        Student st4=new Student();
        st4.setStudentInfo("Anna","Ukrainian", 33,3.9, 'F', true);

        Student[]   students={st1,st2,st3,st4};

        ArrayList<Student>  canGrad=new ArrayList<>(Arrays.asList(students));
        canGrad.removeIf(p-> p.gpa<=3.0);

//        System.out.println(st1);

        for (int i = 0; i < canGrad.size(); i++) {
            System.out.println(canGrad.get(i).name+", GPA "+canGrad.get(i).gpa+" can graduate.");
        }

        ArrayList<Student>  cantGrad=new ArrayList<>(Arrays.asList(students));
        cantGrad.removeIf(p-> p.gpa>3.0);


        for (int i = 0; i < cantGrad.size(); i++) {
            System.out.println(cantGrad.get(i).name+", GPA "+cantGrad.get(i).gpa+" won't graduate.");
        }
    }
}
