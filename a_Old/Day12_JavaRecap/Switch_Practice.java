package a_Old.Day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {
        switch (3) {
            case 1:
                System.out.println("Case 1");
                break; //exits switch statement
            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Invalid case");
        }

        String result = "";

        int statusCode = 404;
        switch (statusCode) {
            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            default:
                result = "Invalid status code";

        }
        System.out.println(result);
    }

}
