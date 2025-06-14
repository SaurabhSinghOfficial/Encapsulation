package in.kgcoding.Question_2;

import java.util.StringJoiner;

public class BankAccount {
    final private String accountNumber;
    final private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BankAccount.class.getSimpleName() + "[", "]")
                .add("accountNumber='" + accountNumber + "'")
                .add("accountHolderName='" + accountHolderName + "'")
                .add("balance=" + balance)
                .toString();
    }

    public void depositMoney(double money){
        if (money <=0){
            System.out.println("Invalid deposit");
        }else{
            balance += money;
            System.out.printf("Your money is %f is successfully deposit\n",money);
        }
    }


    public void withdrawMoney(double money){
         if (balance < money ) {
            System.out.println("Your have insufficient balance ");
         }else if (money <= 0){
             System.out.println("Invalid withdrawal");
         }else if (balance >= money){
            balance -= money;
            System.out.printf("Your amount %f is successfully withdrawal, Your Balance is: %f \n", money,balance);
        }else {
            money = balance;
            balance = 0;
            System.out.printf("Your amount %f is successfully withdrawal ", money);
        }
    }


}
