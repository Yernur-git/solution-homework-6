package part_2;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int targetTemperature;

    public SetThermostatCommand(Thermostat thermostat, int targetTemperature) {
        this.thermostat = thermostat;
        this.targetTemperature = targetTemperature;
    }

    public void execute() {
        thermostat.setTemperature(targetTemperature);
    }

    public void undo() {
        thermostat.revertTemperature();
    }
}
