package part_2;

import java.util.Stack;

public class SmartHomeRemoteControl {
    private Command[] slots;
    private Stack<Command> commandHistory = new Stack<>();

    public SmartHomeRemoteControl(int numSlots) {
        slots = new Command[numSlots];
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < slots.length) {
            slots[slot] = command;
        }
    }

    public void pressButton(int slot) {
        if (slot >= 0 && slot < slots.length && slots[slot] != null) {
            Command command = slots[slot];
            command.execute();
            commandHistory.push(command);
        }
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            System.out.println("Undo last command");
            Command Command = commandHistory.pop();
            Command.undo();
        }
    }
}
