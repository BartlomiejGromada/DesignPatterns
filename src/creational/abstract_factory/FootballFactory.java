package creational.abstract_factory;

public class FootballFactory implements Factory{

    @Override
    public Athlete createAthlete(String firstName, String lastName) {
        return new Footballer(firstName, lastName);
    }

    @Override
    public void printInfo() {
        System.out.println("Football factory");
    }

}
