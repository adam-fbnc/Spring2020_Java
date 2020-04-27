package Day25_MethodsRecap;

public class DriverTernary2 {
    public static String getDriver1(String browserName){
        String result=" driver";
    browserName=browserName.toLowerCase();
    result=(browserName.equals("chrome")
            ||browserName.equals("chrome")
            ||browserName.equals("firefox")
            ||browserName.equals("opera")
            ||browserName.equals("edge"))
            ? browserName+result
            : "Invalid brower name";

        System.out.println(result);
        
        return result;
    }

    public static void main(String[] args) {
        getDriver1("chrome");
        getDriver1("edge");
        getDriver1("internet explorer");
        getDriver1("Chrome");
        getDriver1("Edge");

    }
}
