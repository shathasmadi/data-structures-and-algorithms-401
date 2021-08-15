package trees;

import java.util.ArrayList;

import static java.lang.Integer.MIN_VALUE;

public class BinaryTree <T> {

    private Node <T> root;

    public ArrayList<T> preArray = new ArrayList<>();
    public ArrayList<T> inOrderArray = new ArrayList<>();
    public ArrayList<T> postOrderArray = new ArrayList<>();

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public  ArrayList <T> preOrder (Node <T> node){
    if (node == null) {
        System.out.println("There is nothing in the tree");
    }
    if (node != null) {
       preArray.add(node.getData());

       if(node.getLeft()!=null){
           preOrder(node.getLeft());
       }
        if (node.getRight()!=null){
            preOrder(node.getRight());
        }
    }
       return  preArray;
     }


    public  ArrayList <T> inOrder (Node <T> node){
        if (node == null) {
            System.out.println("There is nothing in the tree");
        }
        if (node != null) {

            if(node.getLeft()!=null){
            inOrder(node.getLeft());
            }
            inOrderArray.add(node.getData());

            if (node.getRight()!=null){
               inOrder(node.getRight());
            }

        }
        return inOrderArray;
    }

    public  ArrayList <T> postOrder (Node <T> node){
        if (node == null) {
            System.out.println("There is nothing in the tree");
        }
        if (node != null) {

            if(node.getLeft()!=null){
                postOrder(node.getLeft());
            }
            if (node.getRight()!=null){
                postOrder(node.getRight());
            }
            postOrderArray.add(node.getData());
        }
        return postOrderArray;
    }

     public int findMaxValue(){
             int num = MIN_VALUE;
             if (getRoot() != null) {
                 ArrayList<T> listArray = inOrder(this.getRoot());
                 for (T i : listArray) {
                     if (num < (Integer)i) {
                         num = (Integer)i;
                     }
                 }
             }
             return num;
         }

        }
