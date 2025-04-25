package part_2;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOnCommand = new TurnOnLightCommand(livingRoomLight);
        Command setThermostatCommand = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl(5);

        remote.setCommand(0, lightOnCommand);
        remote.setCommand(1, setThermostatCommand);

        remote.pressButton(0);
        remote.pressButton(1);
    
        remote.undo();
    }
}
