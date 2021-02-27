package behavioral.observer;

public class AppObserver {

    public static void main(String[] args) {
        Subject subject = new Subject(20);
        System.out.println("Subject: " + subject.getState());

        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);

        System.out.println("Subject state change to 10");
        subject.setState(10);

    }
}
