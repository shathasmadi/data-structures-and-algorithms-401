package hashtable;

public class Node <T>{
    Node<T> next;
    T value ;
    T key;

    public Node(T key, T value) {
        this.value = value;
        this.key = key;
    }

    public Node() {
    }
    
}
