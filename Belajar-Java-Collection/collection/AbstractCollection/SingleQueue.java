package AbstractCollection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue<E> {

    private E name;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(name).iterator();
    }

    @Override
    public int size() {
        return (name != null) ? 1 : 0;
    }

    @Override
    public boolean offer(E e) {
        if (name == null) {
            name = e; 
            return true;
        }
        return false;
    }

    @Override
    public E peek() {
        return name;
    }

    @Override
    public E poll() {
        var temp = name;
        name = null;
        return temp;
    }
}
