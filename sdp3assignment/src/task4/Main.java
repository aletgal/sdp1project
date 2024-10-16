package task4;

public class Main {
    public static void main(String[] args) {
        DispatcherMediator mediator = new DispatcherMediator();
        Client client = new Client(mediator);
        Driver driver = new Driver(mediator);
        Dispatcher dispatcher = new Dispatcher(mediator);

        mediator.setClient(client);
        mediator.setDriver(driver);

        mediator.setDispatcher(dispatcher);

        client.requestRide();
        driver.completeRide();
    }
}
