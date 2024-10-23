package Task2;

public class ConfirmedState implements State {

    @Override
    public void next(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new CreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is confirmed.");
    }
}
