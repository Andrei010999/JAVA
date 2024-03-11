package BankExe;

import BankExe.Card;
import BankExe.BankAccount;

public class Account extends BankAccount {
    private Card card;

    public Account(long iban, String name, String currency) {
        super(iban, name, currency);
    }

    public void setCard(Card card){
        this.card = card;
    }
    public void transferIntreConturi(double sum, BankAccount account){
        if (super.getBalance() <sum){
            System.out.println("No available funds");
        }else if (super.getCurrency() == "RON" && account.getCurrency() == "RON"){
            double balance = super.getBalance();
            balance -= sum;
            super.setBalance(balance);

            double balanceAccount2 = account.getBalance() + sum;
            account.deposit(balanceAccount2);

        } else {
            System.out.println("Balance not corresponding");
        }
    }

}
