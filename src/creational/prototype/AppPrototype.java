package creational.prototype;

public class AppPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog("Tom", "Barbet", "Black");
        System.out.println("Original dog: " + dog);

        System.out.println("Copy original dog before changes");
        Dog copyDog = (Dog) dog.clone();

        dog.setName("Even");
        System.out.println("Change original dog name: " + dog);

        System.out.println("Copy dog is still the same: "+ copyDog);
    }
}
