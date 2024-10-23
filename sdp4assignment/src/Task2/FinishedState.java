package Task2;

public class FinishedState implements State {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order is already completed.");
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is completed.");
    }
}

