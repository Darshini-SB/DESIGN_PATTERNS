package STATE;

// Green light state implementation
public class GreenLight implements TrafficLightState{
    public void changeLight(TrafficLight context)
    {
        System.out.println("green light turning red");
        context.setState(new RedLight());
    }
}
