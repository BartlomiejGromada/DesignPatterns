package behavioral.template_method;

public class BasketballGame extends Game {

    @Override
    public void initializeGame() {
        System.out.println("Initialize basketball game.");
    }

    @Override
    public void startGame() {
        System.out.println("Start basketball game.");
    }

    @Override
    public void stopGame() {
        System.out.println("Stop basketball game.");
    }
}
