package Task_1;
import java.util.EmptyStackException;

public class GenericStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public void push(E o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E item = elements[--size];
        elements[size] = null; // Помогает сборщику мусора
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size == elements.length) {
            E[] newElements = (E[]) new Object[2 * size];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
}
