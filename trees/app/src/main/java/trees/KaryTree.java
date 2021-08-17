package trees;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree <T> {
    KNode root=null;
    int node = 0;
    int K=0;
    public KaryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }
    public boolean isEmpty() {

        return root == null;
    }
    public void add(T data){
        node++;
        KNode<T> newNode = new KNode<>(data);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<KNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            KNode currNode = queue.poll();
            if(currNode.children.size() < this.K){
                currNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currNode.children);
            }
        }
    }
}
