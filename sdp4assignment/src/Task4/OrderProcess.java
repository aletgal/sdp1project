package Task4;

public abstract class OrderProcess {

    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    protected abstract void checkAvailability();

    protected abstract void calculateCost();

    protected void confirmOrder() {
        System.out.println("Order confirmed by default.");
    }
}

