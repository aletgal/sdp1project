package Task2;

public interface State {
    void next(OrderContext context);
    void prev(OrderContext context);
    void printStatus();
}
