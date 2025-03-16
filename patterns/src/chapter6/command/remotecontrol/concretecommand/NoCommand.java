package chapter6.command.remotecontrol.concretecommand;

import chapter6.command.remotecontrol.Command;

// No-op Command implementation for empty or default behavior
public class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing
    }

    @Override
    public void undo() {
        // Do nothing
    }
}