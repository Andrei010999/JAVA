package BankExe;

public class Card {
    private long nrCard;
    private int cvv;
    private int pin;
    private String name;


    public Card(long nrCard, int cvv, int pin, String name){
        this.nrCard = nrCard;
        this.cvv = cvv;
        this.pin = pin;
        this.name = name;
    }


}
