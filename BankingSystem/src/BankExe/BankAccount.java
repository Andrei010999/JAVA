package BankExe;

import BankExe.Card;

public class BankAccount {
    private long iban;
    private String name;
    private double balance;
    private String currency;
    private Card card;

    public BankAccount(long iban, String name, String currency){
        this.iban = iban;
        this.name= name;
        this.currency = currency;
        balance = 0;
    }

    public void setCard(Card card){
        this.card = card;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCurrency(){
        return currency;
    }

    public void deposit(double sum){
        System.out.println("deposit from bank account");
        balance += sum;
    }

    public void withdraw(double sum){
        if (balance <sum){
            System.out.println("No funds");}
        else {
            balance -= sum;
        }
    }

}
