package FACADE;

public class Main {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();
        HomeTheatre homeTheatre = new HomeTheatre(dvdPlayer, projector, soundSystem);
        
        homeTheatre.setMovie("inception"); // Facade simplifies complex setup
        homeTheatre.endMovie();
    }
}
