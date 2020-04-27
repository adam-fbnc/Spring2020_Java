package a_Old.Day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int statusCode = scan.nextInt();

        String result = "";

        result = (statusCode == 200) ? "OK"
                : (statusCode == 201) ? "Created"
                : (statusCode == 202) ? "Accepted"
                : "Invalid status code";
        System.out.println(result);

    }
}
