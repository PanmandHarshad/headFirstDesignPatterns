package chapter7.facade.hometheater;

import chapter7.facade.hometheater.components.Amplifier;
import chapter7.facade.hometheater.components.DVDPlayer;
import chapter7.facade.hometheater.components.Projector;
import chapter7.facade.hometheater.components.TheaterLights;

public class HomeTheaterFacade {

    private final Amplifier amp;
    private final DVDPlayer dvd;
    private final Projector projector;
    private final TheaterLights lights;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, TheaterLights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        projector.off();
        amp.off();
        dvd.off();
    }
}
