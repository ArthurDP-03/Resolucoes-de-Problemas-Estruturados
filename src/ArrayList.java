public class ArrayList <T> {

    private T[] data;
    private int capacity;

    public ArrayList() {
        this.capacity = 10;
        this.data = (T[]) new Object[this.capacity];
    }

    public ArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        this.capacity = capacity;
        this.data = (T[]) new Object[this.capacity];
    }

    public void add(T e){
        for (int i = 0; i < capacity; i++) {
            if (data[i] == null) {
                data[i] = e;
                return;
            }
        }
        throw new RuntimeException("ArrayList cheio");
    }

    public void add(int index, T e) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (data[capacity - 1] != null) {
            throw new RuntimeException("ArrayList cheio");
        }
        for (int i = capacity - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
    }

    public void remove(int index) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        for (int i = index; i < capacity - 1; i++) {
            data[i] = data[i + 1];
        }
        data[capacity - 1] = null;
    }

    public void remove(T o) {
        for (int i = 0; i < capacity; i++) {
            if (data[i] != null && data[i].equals(o)) {
                remove(i);
                return;
            }
        }
    }

    public void set(int index, T e) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        data[index] = e;
    }

    public T get(int index){
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return data[index];
    }

    public boolean contains(T o) {
        for (int i = 0; i < capacity; i++) {
            if (data[i] != null && data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T o) {
        for (int i = 0; i < capacity; i++) {
            if (data[i] != null && data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        boolean primeiro = true;
        for (int i = 0; i < capacity; i++) {
            if (data[i] != null) {
                if (!primeiro) {
                    sb.append(", ");
                }
                sb.append(data[i]);
                primeiro = false;
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public Object[] toArray() {
        Object[] result = new Object[capacity];
        int j = 0;

        for (int i = 0; i < capacity; i++) {
            if (data[i] != null) {
                result[j++] = data[i];
            }
        }

        return result;
    }

}

