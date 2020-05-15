package Day39_AccessModifiers;

public class employeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Rustem");
        Employee employee2=new Employee("John", "Mechanic");
        Employee employee3=new Employee("Saban", "SDET", 123);
        Employee employee4=new Employee("Ozgur", "SDET", 456, 40000);
        Employee employee5=new Employee("Osman", "SDET", 789, 45000, 'M');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    }
}
