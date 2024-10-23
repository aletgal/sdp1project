package Task3;

public class ByTimeStrategy implements PricingStrategy {
    private double ratePerMinute;

    public ByTimeStrategy(double ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    @Override
    public double calculateCost(double time) {
        return time * ratePerMinute;
    }
}
