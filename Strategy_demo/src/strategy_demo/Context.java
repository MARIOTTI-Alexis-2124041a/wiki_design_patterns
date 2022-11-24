package strategy_demo;

public class Context {
    PaiementStrategy paiementStrategy;

    public void setPaiementStrategy(PaiementStrategy paiementStrategy) {
        this.paiementStrategy = paiementStrategy;
    }

    public void pay(int amount) {
        paiementStrategy.pay(amount);
    }
}
