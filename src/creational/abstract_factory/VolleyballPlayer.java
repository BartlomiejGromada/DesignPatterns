package creational.abstract_factory;

public class VolleyballPlayer extends Athlete {

    SportType sportType;

    protected VolleyballPlayer(String firstName, String lastName) {
        super(firstName, lastName);
        this.sportType = SportType.VOLLEYBALL;
    }

    @Override
    void play() {
        System.out.println("I'm playing volleyball");
    }

    @Override
    public String toString() {
        return super.toString() + " -> VolleyballPlayer: " +
                "sportType=" + sportType;
    }
}
