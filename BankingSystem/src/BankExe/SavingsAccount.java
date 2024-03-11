package BankExe;

import BankExe.BankAccount;

public class SavingsAccount  extends BankAccount {

    public SavingsAccount(long iban, String name) {
        super(iban, name, "RON");
    }

    public void deposit(double amount){
        System.out.println("Deposit economies");
        double interest;
        if (amount>100){
            interest = (amount*0.1)/100;
        } else {
            interest = amount*0.05/100;
        }
        amount += interest;
        super.setBalance(amount);


    }


}
