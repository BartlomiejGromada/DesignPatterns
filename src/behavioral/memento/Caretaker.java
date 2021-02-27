package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
