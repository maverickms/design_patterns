public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlInvoker remote = new RemoteControlInvoker();

        // all receiver objects instantiated
        Light livingRoomLight = new Light("Living Room Light");
        Light kitchenLight = new Light("Kitchen Light");
        CeilingFan livingRoomFan = new CeilingFan("Living Room Fan");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        // create all command objects and set the receiver objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand livingFanOn = new CeilingFanOnCommand(livingRoomFan);
        CeilingFanOffCommand livingFanOff = new CeilingFanOffCommand(livingRoomFan);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorClosedCommand garageClosed = new GarageDoorClosedCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);


        // set up the invoker
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, livingFanOn, livingFanOff);
        remote.setCommand(3, garageOpen, garageClosed);
        remote.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);

        // play
        System.out.println(remote.toString());

        System.out.println("****** ON *******");
        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.onButtonWasPushed(4);

        System.out.println("******** OFF *******");
        remote.offButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);
        remote.offButtonWasPushed(3);
        remote.offButtonWasPushed(4);

    }
}
