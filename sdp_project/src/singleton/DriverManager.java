package singleton;

public class DriverManager {
    private static DriverManager instance;

    private DriverManager() {}

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: " + location);
        return "Driver1";
    }
}

