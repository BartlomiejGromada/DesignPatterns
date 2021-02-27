package behavioral.template_method;

public class FootballGame extends Game {

    @Override
    public void initializeGame() {
        System.out.println("Initialize football game.");
    }

    @Override
    public void startGame() {
        System.out.println("Start football game.");
    }

    @Override
    public void stopGame() {
        System.out.println("Stop football game.");
    }
}
