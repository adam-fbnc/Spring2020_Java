package Day37_Constructors;

public class CybertekStudents {
    static String schoolName;
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName="Cybertek";
        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group number: " +groupNumber;
    }


}

class cObjects{
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Drar",3,"18");
        System.out.println(student1);
        CybertekStudents student2 = new CybertekStudents("Sarah",12,"18");
        System.out.println(student2);
    }
}
