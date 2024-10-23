package Task2;

public class CreatedState implements State {

    @Override
    public void next(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    @Override
    public void prev(OrderContext context) {
        System.out.println("The order is in its initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is created.");
    }
}
