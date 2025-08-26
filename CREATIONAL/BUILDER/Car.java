public class Car {
    private String engine;
    private int seats;
    private boolean hasGps;
    private boolean hasAc;

    private Car(CarBuilder builder)
    {
        this.engine=builder.engine;
        this.seats=builder.seats;
        this.hasGps=builder.hasGps;
        this.hasAc=builder.hasAc;

    }

    public void showDetails()
    {
        System.out.println("Engine: " + engine);
        System.out.println("Seats: " + seats);
        System.out.println("GPS: " + (hasGps?"Yes":"No"));
        System.out.println("Air Conditioning: " + (hasAc?"Yes":"No"));
    }

    public static class CarBuilder {
        private String engine;
        private int seats;
        private boolean hasGps;
        private boolean hasAc;
    
        public CarBuilder setEngine(String engine)
        {
            this.engine=engine;
            return this;
        }
        public CarBuilder setSeats(int seats)
        {
            this.seats=seats;
            return this;
        }
        public CarBuilder setGps(boolean hasGps)
        {
            this.hasGps=hasGps;
            return this;
        }
        public CarBuilder setAc(boolean hasAc)
        {
            this.hasAc=hasAc;
            return this;
        }
    
        public Car build()
        {
            return new Car(this);
        }
    }
    
}
