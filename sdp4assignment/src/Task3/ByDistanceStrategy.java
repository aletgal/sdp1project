package Task3;

public class ByDistanceStrategy implements PricingStrategy {
    private double ratePerKm;

    public ByDistanceStrategy(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    @Override
    public double calculateCost(double distance) {
        return distance * ratePerKm;
    }
}

