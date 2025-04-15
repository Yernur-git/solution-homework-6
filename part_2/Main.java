package part_2;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat livingRoomThermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(livingRoomLight);
        Command setTempTo22 = new SetThermostatCommand(livingRoomThermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl(2);
        remote.setCommand(0, lightOn);
        remote.setCommand(1, setTempTo22);

        System.out.println("=== DEMO ===");
        remote.pressButton(0);
        remote.pressButton(1);
        remote.undo();
    }
}
