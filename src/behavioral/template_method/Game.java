package behavioral.template_method;

public abstract class Game {

    public abstract void initializeGame();

    public abstract void startGame();

    public abstract void stopGame();

    protected void play() {
        initializeGame();
        startGame();
        stopGame();
    }
}
