package STATE;

// Yellow light state implementation
public class YellowLight implements TrafficLightState{
    public void changeLight(TrafficLight context)
    {
        System.out.println("yellow light turning green");
        context.setState(new GreenLight());
    }
}
