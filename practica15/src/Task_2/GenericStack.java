package Task_2;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {

    public void push(E element) {
        add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return remove(size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return get(size() - 1);
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}

