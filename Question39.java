class BankAccount {
    private double balance;
    BankAccount(double balance){this.balance=balance;}
    public void deposit(double amount){if(amount>0)balance+=amount;}
    public double getBalance(){return balance;}
}
public class Question39 {
    public static void main(String[] args) {
        BankAccount a=new BankAccount(1000);
        a.deposit(500);
        System.out.println("Balance = "+a.getBalance());
    }
}
