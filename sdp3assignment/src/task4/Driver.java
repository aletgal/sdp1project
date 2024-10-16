package task4;

public class Driver {
    private Mediator mediator;


    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void assignRide() {
        System.out.println("Driver: Ride assigned.");
    }

    public void completeRide() {
        System.out.println("Driver: Completing the ride.");
        mediator.notify(this, "RideCompleted");
    }
}

