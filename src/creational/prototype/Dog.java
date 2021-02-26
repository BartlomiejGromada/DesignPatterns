package creational.prototype;

public class Dog implements Cloneable {
    private String name;
    private String breed;
    private String coatColor;

    public Dog(String name, String breed, String coatColor) {
        this.name = name;
        this.breed = breed;
        this.coatColor = coatColor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", coatColor='" + coatColor + '\'' +
                '}';
    }
}
