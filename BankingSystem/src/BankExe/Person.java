package BankExe;

import BankExe.BankAccount;

public class Person {
    private String firstName;
    private String lastName;
    private String ci;
    private BankAccount account;

    public Person(String firstName, String lastName, String ci){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ci = ci;
    }

    public void setBankAccount(BankAccount account){
        this.account = account;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

}
