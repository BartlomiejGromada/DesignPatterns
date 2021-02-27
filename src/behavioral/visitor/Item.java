package behavioral.visitor;

public interface Item {
    int accept(Visitor visitor);
}
