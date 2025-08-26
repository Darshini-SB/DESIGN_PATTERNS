package COMMAND;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOn(light);
        Command lightOff = new LightOff(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.pressUndo();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
        remoteControl.pressUndo(); // Command pattern in action
    }
}
