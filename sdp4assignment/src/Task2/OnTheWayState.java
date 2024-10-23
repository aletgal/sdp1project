package Task2;

public class OnTheWayState implements State {

    @Override
    public void next(OrderContext context) {
        context.setState(new FinishedState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Taxi is en route.");
    }
}

