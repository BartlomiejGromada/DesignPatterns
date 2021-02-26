package creational.builder;

public class AppBuilder {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("Tom")
                .setLastName("Holland")
                .setGender(Gender.MALE)
                .setIsSingle(false)
                .setWeight(75)
                .setHeight(180)
                .build();

        System.out.println(person);
    }
}
