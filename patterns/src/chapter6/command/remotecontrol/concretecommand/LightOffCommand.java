package chapter6.command.remotecontrol.concretecommand;

import chapter6.command.remotecontrol.Command;
import chapter6.command.remotecontrol.receiver.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
