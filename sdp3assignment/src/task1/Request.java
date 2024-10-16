package task1;

class Request {
    private boolean carAvailable;
    private double clientBalance;
    private double requiredBalance;
    private boolean locationServiceable;

    public Request(boolean carAvailable, double clientBalance, double requiredBalance, boolean locationServiceable) {
        this.carAvailable = carAvailable;
        this.clientBalance = clientBalance;
        this.requiredBalance = requiredBalance;
        this.locationServiceable = locationServiceable;
    }

    public boolean isCarAvailable() {
        return carAvailable;
    }

    public double getClientBalance() {
        return clientBalance;
    }

    public double getRequiredBalance() {
        return requiredBalance;
    }

    public boolean isLocationServiceable() {
        return locationServiceable;
    }
}