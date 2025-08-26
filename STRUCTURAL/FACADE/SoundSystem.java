package FACADE;

// Sound system subsystem
public class SoundSystem {
    public void turnOn()
    {
        System.out.println("soundsystem is turning on");
    }
    public void setVolume(int volume)
    {
        System.out.println("volume is set to " + volume);
    }
    public void turnOff()
    {
        System.out.println("soundsystem is turning off");
    }
}
