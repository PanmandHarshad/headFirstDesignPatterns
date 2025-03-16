package chapter6.command.remotecontrol.concretecommand;

import chapter6.command.remotecontrol.Command;
import chapter6.command.remotecontrol.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
