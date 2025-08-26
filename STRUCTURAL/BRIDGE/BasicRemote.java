package BRIDGE;

public class BasicRemote extends RemoteControl{
    public BasicRemote(Device device)
    {
        super(device);
    }
    public void mute()
    {
        System.out.println("muting the device");
        device.setVolume(0);
    }
}
