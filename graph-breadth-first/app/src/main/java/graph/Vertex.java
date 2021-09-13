package graph;

public class Vertex <T> {
    T value;

    public Vertex(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }
}
