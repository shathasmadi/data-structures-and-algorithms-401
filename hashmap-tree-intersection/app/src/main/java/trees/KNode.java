package trees;

import java.util.ArrayList;
import java.util.List;

public class KNode <T>{
    T data;
    List<KNode<T>> children = new ArrayList<>();

    public KNode(T data) {
        this.data = data;
    }


    public List<KNode<T>> getChildren() {
        return children;
    }

    public void addChild(KNode<T> child) {
        this.children.add(child);
    }

}
