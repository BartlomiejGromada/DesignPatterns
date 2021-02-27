package behavioral.mediator;

public class AppMediator {

    public static void main(String[] args) {
        ApplicationMediator applicationMediator = new ApplicationMediator();
        Colleague concreteColleague = new ConcreteColleague(applicationMediator);
        Colleague mobileColleague = new MobileColleague(applicationMediator);
        applicationMediator.addColleague(concreteColleague);
        applicationMediator.addColleague(mobileColleague);
        concreteColleague.send("Message");
        mobileColleague.send("Hello");
    }
}
