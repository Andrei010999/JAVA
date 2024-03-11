package BankExe;

public class  MainBank {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", "123456765");
        Card card1RON = new Card(1234323234243L, 111, 1234, person1.getName());
        Account account1 = new Account(957463, "Current account", "RON");
        Account account2 = new Account(1234456, "Current account", "RON");

        account1.setCard(card1RON);
        person1.setBankAccount(account1);


        System.out.println(" account 1 balance : " + account1.getBalance() + " " + account1.getCurrency());
        account1.deposit(30);
        System.out.println(" account 1 balance : " + account1.getBalance() + " " + account1.getCurrency());
        account1.withdraw(10);
        System.out.println(" account 1 balance : " + account1.getBalance() + " " + account1.getCurrency());
        account1.transferIntreConturi(10, account2);
        System.out.println(" account 1 balance: " + account1.getBalance() + " " + account1.getCurrency());
        System.out.println(" account 2 balance : " + account2.getBalance() + " " + account2.getCurrency());

        System.out.println("---------------Savings");
        SavingsAccount savingsAccount = new SavingsAccount(12413, "cont economii");
        System.out.println("Saving account before deposit " + savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println("Saving account after deposit " + savingsAccount.getBalance());

        ExchangeCurrency.exchangeEURtoRon(50);

    }
}
