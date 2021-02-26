package creational.abstract_factory;

public class Footballer extends Athlete {

    private SportType sportType;

    protected Footballer(String firstName, String lastName) {
        super(firstName, lastName);
        this.sportType = SportType.FOOTBALL;
    }

    @Override
    void play() {
        System.out.println("I'm playing football");
    }

    @Override
    public String toString() {
        return super.toString() + " -> Footballer: " +
                "sportType=" + sportType;
    }
}
