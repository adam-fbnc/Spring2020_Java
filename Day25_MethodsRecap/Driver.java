package Day25_MethodsRecap;

public class Driver {
    public static String getDriver1(String browserName){
        String result=" driver";
        switch (browserName.toLowerCase()){
            case "chrome":
                result=browserName+result;
                break;
            case "firefox":
                result=browserName+result;
                break;
            case "safari":
                result=browserName+result;
                break;
            case "opera":
                result=browserName+result;
                break;
            case "edge":
                result=browserName+result;
                break;
            default: result ="Invalid brower name";

        }
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
