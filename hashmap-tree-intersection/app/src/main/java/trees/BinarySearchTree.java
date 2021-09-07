package trees;

public class BinarySearchTree <T> extends BinaryTree{

    public void add(int value) {
        Node<T> node = new Node(value);
        Node current;
        if (this.getRoot() == null) {
            this.setRoot(node);
        } else {
            current = this.getRoot();
            traverse(current, node);

        }
    }

    private void traverse(Node current, Node node) {
        if ((int)node.getData() < (int)current.getData()) {
            if (current.getLeft() == null) {
                current.setLeft(node);
            } else {
                current = current.getLeft();
                traverse(current, node);
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(node);
            } else {
                current = current.getRight();
                traverse(current, node);
            }
        }
    }

    public boolean contains(int value){
        Node root = getRoot();
        return traverseContains(root, value);
    }

    public boolean traverseContains(Node root, int value){
        if(root == null){
            return false;
        }
        if((int)root.getData() == value){
            return true;
        }
        if((int)root.getData() > value) {
            return traverseContains(root.getLeft(), value);
        }else{
            return traverseContains(root.getRight(), value);
        }

    }

}
