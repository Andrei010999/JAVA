package BankExe;

public class ExchangeCurrency {
    public static final double exchangeRate = 4.9;

    public static void exchangeEURtoRon(double ammountForExchange){
        double result = exchangeRate*ammountForExchange;
        System.out.println("Ron amount from exchange " + result);
    }
    public static void exchangeRontoEur(double ammountForExchange){
        double result = ammountForExchange/exchangeRate;
        System.out.println("Eur amount from exchange " + result);
    }
}
