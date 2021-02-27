package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague coll : colleagues) {
            if (coll != colleague)
                coll.receive(message);
        }
    }
}
