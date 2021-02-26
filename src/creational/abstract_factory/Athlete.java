package creational.abstract_factory;

public abstract class Athlete {

    String firstName;
    String lastName;

    protected Athlete(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void play();

    @Override
    public String toString() {
        return "Athlete: " +
                "firstName= " + firstName +
                ", lastName= " + lastName;
    }
}
