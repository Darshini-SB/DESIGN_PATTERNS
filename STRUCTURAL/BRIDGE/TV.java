package BRIDGE;

public class TV implements Device{
    private int volume;
    public void turnOn()
    {
        System.out.println("tv is turning on");
    }
    public void turnOff()
    {
        System.out.println("tv is turning off");
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
        System.out.println("tv volume is set to " + volume);
    }
    public int getVolume()
    {
        return volume;
    }
}
