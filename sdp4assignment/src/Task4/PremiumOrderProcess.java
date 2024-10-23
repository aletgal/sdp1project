package Task4;

public class PremiumOrderProcess extends OrderProcess {

    @Override
    protected void checkAvailability() {
        System.out.println("Checking availability of premium taxis...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for premium taxi...");
    }
}

