package FACADE;

// Projector subsystem
public class Projector {
    public void turnOn()
    {
        System.out.println("projector is turning on");
    }
    public void setInput(String input)
    {
        System.out.println("projector input set to " + input);
    }
    public void turnOff()
    {
        System.out.println("projector is turning off");
    }
}
