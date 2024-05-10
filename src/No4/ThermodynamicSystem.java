package No4;

// Abstract base class representing a generic thermodynamic system
public abstract class ThermodynamicSystem {
    protected double temperature;
    protected double pressure;
    protected double volume;
    protected double energy;

    // Constructor
    public ThermodynamicSystem(double temperature, double pressure, double volume, double energy) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.volume = volume;
        this.energy = energy;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void calculateEnergyChange();
    public abstract void calculateTemperatureChange();
    public abstract void calculatePressureChange();
    public abstract void calculateVolumeChange();

    // Getters and setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}
