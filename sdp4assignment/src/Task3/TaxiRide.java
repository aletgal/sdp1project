package Task3;

public class TaxiRide {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateCost(double value) {
        return pricingStrategy.calculateCost(value);
    }
}

