package builder;

public class Driver {
    private String name;
    private String carModel;
    private String licenseNumber;
    private int experienceYears;
    private boolean isAvailable;

    Driver(DriverBuilder builder) {
        this.name = builder.getName();
        this.carModel = builder.getCarModel();
        this.licenseNumber = builder.getLicenseNumber();
        this.experienceYears = builder.getExperienceYears();
        this.isAvailable = builder.isAvailable();
    }

    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Driver " +
                "name= " + name + '\'' + "\n" +
                "CarModel = " + carModel + "\n" +
                "LicenseNumber = " + licenseNumber + "\n" +
                "ExperienceYears = " + experienceYears + "\n" +
                "IsAvailable = " + isAvailable;
    }
}

