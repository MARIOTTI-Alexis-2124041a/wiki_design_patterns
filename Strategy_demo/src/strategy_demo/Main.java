package strategy_demo;

public class Main {
    public static void main(String[] args) {
        Product awesome_keyboard = new Product("Awesome keyboard", 30);
        Context context = new Context();

        context.setPaiementStrategy(new PayInCash());
        context.pay(awesome_keyboard.getPrice());
        context.setPaiementStrategy(new PayByCreditCard("54656516876", 1234));
        context.pay(awesome_keyboard.getPrice());
    }
}
