package part_2;

public class Thermostat {
    private int currentTemperature;
    private int previousTemperature;

    public void setTemperature(int temperature) {
        previousTemperature = currentTemperature;
        currentTemperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public int getTemperature() {
        return currentTemperature;
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature");
        currentTemperature = previousTemperature;
    }
}
