public class GarageDoorClosedCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorClosedCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.close();
    }

    public void undo() {
        garageDoor.open();
    }
}
