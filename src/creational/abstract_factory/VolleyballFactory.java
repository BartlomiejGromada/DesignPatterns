package creational.abstract_factory;

public class VolleyballFactory implements Factory {

    @Override
    public Athlete createAthlete(String firstName, String lastName) {
        return new VolleyballPlayer(firstName, lastName);
    }

    @Override
    public void printInfo() {
        System.out.println("Volleyball factory");
    }
}
