public class Queue<T> {

    protected Node<T> first;
    protected Node<T> top;
    private int size;

    public Queue() {
        first = null;
        top = null;
        size = 0;
    }

    public void enqueue(T e) {
        Node<T> newNode = new Node<>(e);

        if (isEmpty()) {
            first = newNode;
            top = newNode;
        } else {
            top.next = newNode;
            top = newNode;
        }

        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        T value = first.data;
        first = first.next;

        if (first == null) {
            top = null;
        }

        size--;
        return value;
    }

    public T front() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        return first.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = null;
        top = null;
        size = 0;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node<T> current = first;
        int i = 0;

        while (current != null) {
            arr[i++] = current.data;
            current = current.next;
        }

        return arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = first;

        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }

        sb.append("null");
        return sb.toString();
    }
}