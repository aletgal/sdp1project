package Task4;

public class Main {
    public static void main(String[] args) {
        OrderProcess standardOrder = new StandardOrderProcess();
        standardOrder.processOrder();

        System.out.println();

        OrderProcess premiumOrder = new PremiumOrderProcess();
        premiumOrder.processOrder();
    }
}
