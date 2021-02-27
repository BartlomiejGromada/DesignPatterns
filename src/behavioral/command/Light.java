package behavioral.command;

public class Light {

    private boolean isOn;

    public Light(boolean isOn) {
        this.isOn = isOn;
    }

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        String text = "Light is ";
        text += (isOn) ? "on" : "off";

        return text;
    }
}
