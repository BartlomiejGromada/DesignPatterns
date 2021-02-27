package behavioral.visitor;

public interface Visitor {
    int visit(Computer computer);
    int visit(Printer printer);
}
