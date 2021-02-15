// Concrete Command, defines the binding between an action and a received
// implements the execute method to call the action(s) on the received

public class LightOffCommand implements Command {
    Light light; //receiver

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on(); // receiver action
    }

    public void undo() {

    }
}
