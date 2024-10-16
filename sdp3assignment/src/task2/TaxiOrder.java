package task2;

class TaxiOrder {
    public void createOrder() {
        System.out.println("Order created.");
    }

    public void cancelOrder() {
        System.out.println("Order canceled.");
    }


    public void changeDestination(String newDestination)
    {
        System.out.println("Destination changed to: " + newDestination);
    }
}
