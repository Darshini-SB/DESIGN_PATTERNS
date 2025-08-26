package BRIDGE;

public class AdvancedRemote extends RemoteControl{
    public AdvancedRemote(Device device)
    {
        super(device);
    }
    public void increaseVolume()
    {
        int currentVolume = device.getVolume();
        device.setVolume(currentVolume + 10);
        System.out.println("increasing the volume :" + device.getVolume());
       
    }
    public void decreaseVolume()
    {
        int currentVolume = device.getVolume();
        device.setVolume(currentVolume - 10);
        System.out.println("decreasing the volume :" + device.getVolume());
       
    }
}
