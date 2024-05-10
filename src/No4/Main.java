package No4;

public class Main {
    public static void main(String[] args) {
        // Create an ideal gas system
        IdealGasSystem idealGasSystem = new IdealGasSystem(300, 1, 10, 0, 8.314); // temperature, pressure, volume, energy, gas constant

        // Calculate energy change
        idealGasSystem.calculateEnergyChange();
        System.out.println("Energy of ideal gas system: " + idealGasSystem.getEnergy());

        // Calculate temperature change
        idealGasSystem.setEnergy(500); // set new energy value
        idealGasSystem.calculateTemperatureChange();
        System.out.println("Temperature of ideal gas system: " + idealGasSystem.getTemperature());

        // Create a non-ideal gas system
        NonIdealGasSystem nonIdealGasSystem = new NonIdealGasSystem(300, 1, 10, 0, 0.08, 0.01); // temperature, pressure, volume, energy, van der Waals constants

        // Calculate pressure change
        nonIdealGasSystem.calculatePressureChange();
        System.out.println("Pressure of non-ideal gas system: " + nonIdealGasSystem.getPressure());

        // Calculate volume change
        nonIdealGasSystem.setPressure(2); // set new pressure value
        nonIdealGasSystem.calculateVolumeChange();
        System.out.println("Volume of non-ideal gas system: " + nonIdealGasSystem.getVolume());
    }
}

