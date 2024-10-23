package Task3;

public class FixedPriceStrategy implements PricingStrategy {
    private double fixedPrice;

    public FixedPriceStrategy(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculateCost(double value) {
        return fixedPrice;
    }
}

