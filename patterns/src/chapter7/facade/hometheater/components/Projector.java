package chapter7.facade.hometheater.components;

public class Projector {

    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }

    public void wideScreenMode() {
        System.out.println("Setting projector to widescreen mode (16:9)");
    }
}
