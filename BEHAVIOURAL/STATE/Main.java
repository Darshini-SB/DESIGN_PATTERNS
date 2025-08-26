package STATE;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for(int i = 0; i < 5; i++)
        {
            trafficLight.change(); // State pattern in action
        }
    }
}
