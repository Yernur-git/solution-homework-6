package part_2;

public class Thermostat {
    private int currentTemperature;

    public void setTemperature(int temperature) {
        this.currentTemperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public int getTemperature() {
        return currentTemperature;
    }
}
