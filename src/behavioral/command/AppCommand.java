package behavioral.command;

public class AppCommand {

    public static void main(String[] args) {
        Light light = new Light(true);
        System.out.println(light);

        RemoteControl remoteControl = new RemoteControl(new LightOffCommand(light));
        remoteControl.pressButton();
        System.out.println(light);

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();
        System.out.println(light);
    }
}
