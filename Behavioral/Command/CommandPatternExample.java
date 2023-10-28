package Behavioral.Command;

public class CommandPatternExample {

    public static void main(String[] args) {
        // Create the receiver
        Light light = new Light();

        // Create the concrete commands with the associated receiver
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Create the invoker
        RemoteControl remoteControl = new RemoteControl();

        // Set and press the ON button
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Set and press the OFF button
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}