package behavioral.memento;

public class Originator {

    private String state;

    public void setState(String state) {
        System.out.println("Originator: Setting state to: " + state);
        this.state = state;
    }

    public Memento saveState() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        System.out.println("Originator: Restore from Memento -> " + memento.getState());
        this.state = memento.getState();
    }
}
