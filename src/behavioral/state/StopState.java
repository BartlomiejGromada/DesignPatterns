package behavioral.state;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Game is stop mode");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop mode";
    }
}
