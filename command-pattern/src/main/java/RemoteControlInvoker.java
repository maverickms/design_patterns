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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control ---------");
        for (int i=0; i<numberOfCommands; i++) {
            stringBuffer.append("\n[slot ")
                    .append(i).append("]\t")
                    .append(onCommands[i].getClass().getName())
                    .append("\t")
                    .append(offCommands[i].getClass().getName());
        }
        stringBuffer.append("\n---------------------------------");

        return stringBuffer.toString();
    }
}
