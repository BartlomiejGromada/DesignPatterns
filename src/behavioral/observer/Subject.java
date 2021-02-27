package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;
    private int state;

    public Subject(int state) {
        this.observers = new ArrayList<>();
        this.state = state;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public int getState() {
        return state;
    }

    private void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }
}
