package Day25_MethodsRecap;

public class DriverTernary {
    public static String getDriver1(String browserName){
        String result=" driver";
    browserName=browserName.toLowerCase();
    result=(browserName.equals("chrome")) ? browserName+result
            : (browserName.equals("firefox")) ? browserName+result
            : (browserName.equals("safari")) ? browserName+result
            : (browserName.equals("opera")) ? browserName+result
            : (browserName.equals("edge")) ? browserName+result
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
