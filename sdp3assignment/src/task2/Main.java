package task2;

public class Main {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder();

        Command createOrder = new CreateOrderCommand(order);
        Command cancelOrder = new CancelOrderCommand(order);
        Command changeDestination = new ChangeDestinationCommand(order, "AITU");

        CommandInvoker invoker = new CommandInvoker();

        invoker.setCommand(createOrder);
        invoker.executeCommand();
        invoker.setCommand(changeDestination);
        invoker.executeCommand();

        invoker.setCommand(cancelOrder);
        invoker.executeCommand();
    }
}
