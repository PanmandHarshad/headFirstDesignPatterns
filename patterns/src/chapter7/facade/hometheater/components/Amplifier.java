package chapter7.facade.hometheater.components;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }

    public void setVolume(int level) {
        System.out.println("Setting value to: " + level);
    }
}
