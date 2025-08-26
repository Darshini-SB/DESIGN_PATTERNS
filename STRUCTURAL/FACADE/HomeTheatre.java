package FACADE;

// Facade class that simplifies home theatre operations
public class HomeTheatre {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    
    public HomeTheatre(DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem)
    {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }
    
    public void setMovie(String movie)
    {
        System.out.println("setting up for movie..");
        projector.turnOn();
        projector.setInput("dvd");
        soundSystem.turnOn();
        soundSystem.setVolume(20);
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
    }
    
    public void endMovie()
    {
        projector.turnOff();
        soundSystem.turnOff();
        dvdPlayer.turnOff();
    }
}
