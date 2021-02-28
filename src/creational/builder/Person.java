package creational.builder;

public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private boolean isSingle;
    private double weight;
    private double height;

    private Person(String firstName, String lastName, Gender gender, boolean isSingle,
                   double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.isSingle = isSingle;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", isSingle=" + isSingle +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Gender gender;
        private boolean isSingle;
        private double weight;
        private double height;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setIsSingle(boolean isSingle) {
            this.isSingle = isSingle;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, gender, isSingle, weight, height);
        }

    }
}
