public class StringArrayList {

    private String[] data;
    private int capacity;
    private int size;

    public StringArrayList(int capacity) {
        this.capacity = capacity;
        data = new String[capacity];
    }

    public StringArrayList() {
        this.capacity = 10;
        data = new String[capacity];
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(data[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    public void add(int index, String string) {
        if (index < 0 || index > size) {
            System.out.println("Index invalido, negativo ou não existe.ARRUMA ESSA MERDA AMIGÃO");
            return;
        }

        if (size + 1 >= capacity ) {
            capacity = capacity + (capacity / 2);
            String[] newData = new String[capacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = string;
        size ++;
    }
}