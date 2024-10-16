package task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Driver> drivers = Arrays.asList(
                new Driver("Alisher", 1.2),
                new Driver("Arman", 2.5),
                new Driver("Adlet", 0.8)
        );

        DriverIterator driverIterator = new DriverIterator(drivers);

        Driver closestDriver = null;
        while (driverIterator.hasNext()) {
            Driver currentDriver = driverIterator.next();
            if (closestDriver == null || currentDriver.getDistance() < closestDriver.getDistance()) {
                closestDriver = currentDriver;
            }
        }

        System.out.println("Closest driver is: " + closestDriver.getName() + " (" + closestDriver.getDistance() + " km away).");
    }
}
