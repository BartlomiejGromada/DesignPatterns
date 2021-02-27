package behavioral.template_method;

public class AppTemplateMethod {

    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        Game basketballGame = new BasketballGame();
        basketballGame.play();

    }
}
