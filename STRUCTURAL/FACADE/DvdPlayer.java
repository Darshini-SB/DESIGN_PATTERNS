package FACADE;

// DVD player subsystem
public class DvdPlayer {
    public void turnOn()
    {
        System.out.println("Dvd is turning on");
    }
    public void play(String movie)
    {
        System.out.println("playing movie " + movie);
    }
    public void turnOff()
    {
        System.out.println("Dvd is turning off");
    }
}
