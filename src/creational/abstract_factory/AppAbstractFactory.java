package creational.abstract_factory;

public class AppAbstractFactory {

    public static void main(String[] args) {
        Factory footballFactory = new FootballFactory();
        Factory volleyballFactory = new VolleyballFactory();

        Athlete footballer = footballFactory.createAthlete("Leo", "Messi");
        Athlete volleyballPlayer = volleyballFactory.createAthlete("Bartosz", "Kurek");

        footballFactory.printInfo();
        System.out.println(footballer+"\n");

        volleyballFactory.printInfo();
        System.out.println(volleyballPlayer);


    }
}
