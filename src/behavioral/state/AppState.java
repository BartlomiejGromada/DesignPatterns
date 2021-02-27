package behavioral.state;

public class AppState {

    public static void main(String[] args) {
        Context context = new Context();
        State startState = new StartState();
        State stopState = new StopState();

        startState.doAction(context);
        System.out.println(context.getState());

        stopState.doAction(context);
        System.out.println(context.getState());
    }
}
