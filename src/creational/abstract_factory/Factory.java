package creational.abstract_factory;

public interface Factory {

    Athlete createAthlete(String firstName, String lastName);

    void printInfo();
}
