package factory;

public abstract class Factory {
    public abstract Taxi createTaxi(String driverName, String license);
}