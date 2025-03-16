package chapter6.command.remotecontrol;

public interface Command {
    void execute();

    void undo();
}
