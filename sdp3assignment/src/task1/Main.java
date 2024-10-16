package task1;

public class Main {
    public static void main(String[] args) {
        Handler carAvailabilityHandler = new CarAvailabilityHandler();
        Handler balanceCheckHandler = new BalanceCheckHandler();
        Handler locationCheckHandler = new LocationCheckHandler();

        carAvailabilityHandler.setNext(balanceCheckHandler).setNext(locationCheckHandler);

        Request request = new Request(true, 50.0, 30.0, true);

        String result = carAvailabilityHandler.handle(request);
        System.out.println(result);
    }
}