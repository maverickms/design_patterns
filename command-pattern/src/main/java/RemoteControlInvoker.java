// Invoker
// holds the commands and asks them to carry out the request by calling the execute method

import java.util.Arrays;

public class RemoteControlInvoker {
    Command[] onCommands;
    Command[] offCommands;
    int numberOfCommands = 5;

    public RemoteControlInvoker() {
        onCommands = new Command[numberOfCommands];
        offCommands = new Command[numberOfCommands];

        Command noCommand = new NoCommand();
        for (int i=0; i<numberOfCommands; i++) {
            // setting all commands to null objects to begin with
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControlInvoker{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
