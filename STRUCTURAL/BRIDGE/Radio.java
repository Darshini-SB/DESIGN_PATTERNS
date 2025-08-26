package BRIDGE;

public class Radio implements Device{
    private int volume;
    public void turnOn()
    {
        System.out.println("radio is turning on");
    }
    public void turnOff()
    {
        System.out.println("radio is turning off");
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
        System.out.println("radio volume is set to " + volume);
    }
    public int getVolume()
    {
        return volume;
    }
}
