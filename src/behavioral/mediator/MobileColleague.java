package behavioral.mediator;

public class MobileColleague extends Colleague {

    public MobileColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile received: "+message);
    }
}
