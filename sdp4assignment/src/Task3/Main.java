package Task3;

public class Main {
    public static void main(String[] args) {
        TaxiRide ride = new TaxiRide();

        ride.setPricingStrategy(new ByDistanceStrategy(10));
        System.out.println("Cost by distance: " + ride.calculateCost(15));

        ride.setPricingStrategy(new ByTimeStrategy(2));
        System.out.println("Cost by time: " + ride.calculateCost(30));

        ride.setPricingStrategy(new FixedPriceStrategy(100));
        System.out.println("Fixed cost: " + ride.calculateCost(0));
    }
}

