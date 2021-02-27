package behavioral.memento;

public class AppMemento {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento(originator.saveState());
        originator.setState("State3");
        caretaker.addMemento(originator.saveState());
        originator.setState("State4");
        originator.restoreState(caretaker.getMemento(1));
    }
}
