package task4;


class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestRide() {
        System.out.println("Client: Requesting a ride.");
        mediator.notify(this, "RequestRide");
    }

}
