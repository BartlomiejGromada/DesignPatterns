package behavioral.state;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Game is start mode");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start mode";
    }
}
