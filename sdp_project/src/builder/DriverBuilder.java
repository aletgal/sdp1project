package builder;

public class DriverBuilder {
    private String name;
    private String carModel;
    private String licenseNumber;
    private int experienceYears;
    private boolean isAvailable;

    public DriverBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DriverBuilder withCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public DriverBuilder withLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public DriverBuilder withExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
        return this;
    }

    public DriverBuilder isAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
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

    public Driver build() {
        return new Driver(this);
    }
}

