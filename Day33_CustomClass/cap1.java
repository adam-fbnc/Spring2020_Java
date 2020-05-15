package Day33_CustomClass;
//import Day33_CustomClass.BankAccount;
public class cap1 {
    public static void main(String[] args) {
        BankAccount Anna=new BankAccount();
        Anna.a_holder="Anna";

        Anna.checkingBalance();
            Anna.deposit(33);
        Anna.checkingBalance();
            Anna.withDrawal(13);
        Anna.checkingBalance();
            Anna.withDrawal(30);
        Anna.checkingBalance();
            Anna.withDrawal(20);
        Anna.checkingBalance();
    }
}
