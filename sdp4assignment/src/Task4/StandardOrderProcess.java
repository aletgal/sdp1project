package Task4;

public class StandardOrderProcess extends OrderProcess {

    @Override
    protected void checkAvailability() {
        System.out.println("Checking availability of standard taxis...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for standard taxi...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Standard taxi order confirmed.");
    }
}

