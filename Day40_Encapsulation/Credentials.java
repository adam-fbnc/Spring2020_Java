package Day40_Encapsulation;

public class Credentials {
    private String UserName;
    private String PassWord;

    public String getUserName(){
        return UserName;
    }
    public String getPassWord(){
        return PassWord;
    }

    public void setUserName(){
        this.UserName=UserName;
    }
    public void setPassWord(){
        this.PassWord=PassWord;
    }
}
