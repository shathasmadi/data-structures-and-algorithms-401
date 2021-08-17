package trees;

import java.util.ArrayList;
import java.util.List;

public class KNode <T>{
    T data;
    List<KNode> children = new ArrayList<>();

    public KNode(T data) {
        this.data = data;
    }


    public List<KNode> getChildren() {
        return children;
    }

    public void addChild(KNode child) {
        this.children.add(child);
    }

}
