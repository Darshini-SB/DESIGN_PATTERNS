package COMMAND;

// Concrete command for turning light on
public class LightOn implements Command{
    private Light light;
    public LightOn(Light light)
    {
       this.light = light;
    }

    public void execute()
    {
        light.turnOn();
    }

    public void undo()
    {
        light.turnOff();
    }
}
