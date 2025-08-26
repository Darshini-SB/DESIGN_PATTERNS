public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.CarBuilder()
                .setEngine("V8 Turbo")
                .setSeats(2)
                .setGps(true)
                .setAc(true)
                .build();

        sportsCar.showDetails();
    }
}
