package in.kgcoding.Question_2;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001","Saurabh");
        System.out.println(account);
        account.depositMoney(100);
        account.withdrawMoney(150);
        account.withdrawMoney(100);
        account.withdrawMoney(50);
        account.depositMoney(0);
        account.depositMoney(-100);
        account.depositMoney(120);
        account.withdrawMoney(-120);
        account.withdrawMoney(120);
        account.depositMoney(100);
    }
}
