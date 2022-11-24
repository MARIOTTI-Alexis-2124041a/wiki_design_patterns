package strategy_demo;

public class PayInCash implements PaiementStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("You just paid an amount of " + amount + " euros in cash");
    }
}
