package STATE;

// Red light state implementation
public class RedLight implements TrafficLightState{
    public void changeLight(TrafficLight context)
    {
        System.out.println("red light turning yellow");
        context.setState(new YellowLight());
    }
}
