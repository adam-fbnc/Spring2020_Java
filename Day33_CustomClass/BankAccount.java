package Day33_CustomClass;

public class BankAccount {
    String a_holder;
    long a_number;
    double a_balance=9;

    public void checkingBalance(){
        System.out.println("Available balance: $"+a_balance);

    }

    public void withDrawal(double amount){

        if(amount<=a_balance){
            System.out.println("Withdrawing $"+amount);
            a_balance-=amount;
        } else if(a_balance<=0){
            System.out.println("You don't have sufficient balance to withdraw $"+amount);
        }else{
            System.out.println("Withdrawing $"+amount+" with $35 penalty!");
            a_balance-=amount;
            a_balance-=35;
        }

    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        a_balance += amount;

    }

    public String toString(){
        return "Account holder: "+a_holder+"\nAccount number: "+a_number+"\nAvailable balance: "+a_balance;
    }

    public static void main(String[] args) {

    }
}
