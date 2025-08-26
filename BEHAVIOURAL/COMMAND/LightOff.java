package COMMAND;

// Concrete command for turning light off
public class LightOff implements Command{
    private Light light;
    public LightOff(Light light)
    {
       this.light = light;
    }

    public void execute()
    {
        light.turnOff();
    }

    public void undo()
    {
        light.turnOn();
    }
}
