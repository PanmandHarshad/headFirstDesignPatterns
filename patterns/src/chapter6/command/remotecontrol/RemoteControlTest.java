package chapter6.command.remotecontrol;

import chapter6.command.remotecontrol.concretecommand.GarageDoorCloseCommand;
import chapter6.command.remotecontrol.concretecommand.GarageDoorOpenCommand;
import chapter6.command.remotecontrol.concretecommand.LightOffCommand;
import chapter6.command.remotecontrol.concretecommand.LightOnCommand;
import chapter6.command.remotecontrol.invoker.RemoteControl;
import chapter6.command.remotecontrol.receiver.GarageDoor;
import chapter6.command.remotecontrol.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Create the receivers
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Create the commands
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        // Set the commands to the remote
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, garageDoorOpen, garageDoorClose);

        // Test: Turn the light on, then off
        System.out.println("Pressing on button for light:");
        remote.pressOnButton(0);  // Output: The light is on
        remote.pressUndoButton(); // Output: The light is off

        System.out.println("\nPressing off button for light:");
        remote.pressOffButton(0);  // Output: The light is off
        remote.pressUndoButton();  // Output: The light is on

        // Test: Open and close the garage door
        System.out.println("\nPressing on button for garage door:");
        remote.pressOnButton(1);  // Output: The garage door is open
        remote.pressUndoButton(); // Output: The garage door is closed

        System.out.println("\nPressing off button for garage door:");
        remote.pressOffButton(1);  // Output: The garage door is closed
        remote.pressUndoButton();  // Output: The garage door is open
    }
}
