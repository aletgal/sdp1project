package task4;

class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;
    private Dispatcher dispatcher;

    public void setClient(Client client) {
        this.client = client;
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    @Override
    public void notify(Object sender, String event) {
        if (sender == client && event.equals("RequestRide")) {
            System.out.println("Dispatcher: A client requested a ride.");
            driver.assignRide();

        } else if (sender == driver && event.equals("RideCompleted")) {
            System.out.println("Dispatcher: The ride has been completed.");
        }


    }
}
