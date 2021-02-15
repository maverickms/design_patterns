// Invoker
// holds the commands and asks them to carry out the request by calling the execute method

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    int numberOfCommands = 5;

    public RemoteControlWithUndo() {
        onCommands = new Command[numberOfCommands];
        offCommands = new Command[numberOfCommands];

        Command noCommand = new NoCommand();
        for (int i=0; i<numberOfCommands; i++) {
            // setting all commands to null objects to begin with
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control ---------");
        for (int i=0; i<numberOfCommands; i++) {
            stringBuffer.append("\n[slot ")
                    .append(i)
                    .append("]\t")
                    .append(onCommands[i].getClass().getName())
                    .append("\t")
                    .append(offCommands[i].getClass().getName());
        }

        stringBuffer.append("\nUndo Command: ")
                .append(undoCommand.getClass().getName());
        stringBuffer.append("\n---------------------------------");

        return stringBuffer.toString();
    }
}
