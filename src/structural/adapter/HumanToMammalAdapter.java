package structural.adapter;

public class HumanToMammalAdapter implements Mammal{

    private Human human;

    public HumanToMammalAdapter(Human human) {
        this.human = human;
    }

    @Override
    public void printInfo() {
        human.saySomething();
    }
}