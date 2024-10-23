package Task2;

public class OrderContext {
    private State state;

    public OrderContext() {
        state = new CreatedState(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
