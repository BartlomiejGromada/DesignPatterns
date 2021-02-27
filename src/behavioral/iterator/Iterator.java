package behavioral.iterator;

public interface Iterator {
    Object next();

    boolean hasNext();

    boolean isEmpty();

    void reset();
}
