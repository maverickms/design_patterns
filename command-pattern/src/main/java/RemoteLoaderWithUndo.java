public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        // all receiver objects instantiated
        Light livingRoomLight = new Light("Living Room Light");

        // create all command objects and set the receiver objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        // set up the invoker
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        // play
        System.out.println(remote.toString());

        remote.onButtonWasPushed(0);

        System.out.println(remote.toString());

        remote.undoButtonWasPushed();

        System.out.println(remote.toString());

    }
}
