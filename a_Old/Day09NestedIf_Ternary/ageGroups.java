package a_Old.Day09NestedIf_Ternary;

public class ageGroups {
    public static void main(String[] args) {
        int age = 100;
        String ageGroup;

        if (age < 3 && age > 0) {
            ageGroup = "Baby";
        } else if (age >= 4 && age < 6) {
            ageGroup = "Toddler";

        } else if (age >= 6 && age < 10) {
            ageGroup = "Kid";
        } else if (age >= 10 && age < 13) {
            ageGroup = "Pre-teen";
        } else if (age >= 13 && age < 18) {
            ageGroup = "Teenerager";

        } else if (age >= 19 && age < 21) {
            ageGroup = "Young Adult";
        } else if (age >= 21 && age < 40) {
            ageGroup = "Adult";
        } else if (age >= 40 && age < 50) {
            ageGroup = "Young Middle-Aged Adult";
        } else if (age >= 50 && age < 55) {
            ageGroup = "Middle-Aged Adult";
        } else if (age >= 56 && age < 65) {
            ageGroup = "Very Young Senior Citizen";
        } else if (age >= 65 && age < 75) {
            ageGroup = "Young Senior Citizen";
        } else if (age >= 75 && age < 85) {
            ageGroup = "Senior Citizen";
        } else if (age >= 85 && age < 151) {
            ageGroup = "Old Senior Citizen";
        } else {
            ageGroup = "Invalid Entry";
        }

        System.out.println(ageGroup);

    }
}
