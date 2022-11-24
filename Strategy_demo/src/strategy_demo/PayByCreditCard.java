package strategy_demo;

public class PayByCreditCard implements PaiementStrategy{
    private String cardNumber;
    private int cardCode;

    public PayByCreditCard(String cardNumber, int cardCode) {
        this.cardNumber = cardNumber;
        this.cardCode = cardCode;
    }

    @Override
    public void pay(int amount) {
        System.out.println("You just paid an amount of " + amount + " euros with a credit card");
    }

}
