package chapter7.facade.hometheater;

import chapter7.facade.hometheater.components.Amplifier;
import chapter7.facade.hometheater.components.DVDPlayer;
import chapter7.facade.hometheater.components.Projector;
import chapter7.facade.hometheater.components.TheaterLights;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights);

        homeTheater.watchMovie("The Matrix");
        homeTheater.endMovie();
    }
}
