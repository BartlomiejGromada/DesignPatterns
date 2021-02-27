package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class StringIterator implements Iterator {

    private List<String> list;
    private int index;

    public StringIterator() {
        this.list = new ArrayList<>();
        index = 0;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        return this.list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void reset() {
        index = 0;
    }
}
