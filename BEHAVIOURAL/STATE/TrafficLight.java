package STATE;

// Context class that maintains state
public class TrafficLight {
    private TrafficLightState state;
    public TrafficLight()
    {
        state = new RedLight();
    }

    public void setState(TrafficLightState state)
    {
        this.state = state;
    }

    public void change()
    {
        state.changeLight(this);
    }
}
