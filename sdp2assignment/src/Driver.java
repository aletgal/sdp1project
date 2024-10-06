public class Driver {
    private Car car;

    public void addCar(Car car) {
        this.car = car;
    }

    public void pickupPassenger(Passenger passenger) {
        System.out.println("Driver is picking up passenger.");
    }
}