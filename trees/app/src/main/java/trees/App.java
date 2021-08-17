/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
//
//        BinarySearchTree <Integer> test = new BinarySearchTree<>();
//        test.setRoot(new Node(10));
//        test.getRoot().setLeft(new Node(8));
//        test.getRoot().getLeft().setLeft(new Node(6));
//        test.getRoot().setRight(new Node(12));
//        test.add(10);
//        System.out.println(test.inOrder(test.getRoot()));
//
//        BinarySearchTree <Integer> testTwo = new BinarySearchTree<>();
//        testTwo.add(10);
//        testTwo.add(15);
//        testTwo.add(30);
//        testTwo.add(12);
//        testTwo.add(8);
//        testTwo.add(9);
//        testTwo.add(5);
//
//        System.out.println(testTwo.contains(50));
//
//
//
//
//        System.out.println(testTwo.findMaxValue());
//
//
//        System.out.println(breadthFirstTree(testTwo));

        KaryTree<Integer> testt = new KaryTree<>(3);
        testt.add(50);
        testt.add(20);
        testt.add(15);
        System.out.println(fizzBuzzTree(testt).root.data);
        System.out.println(testt.root.data);



    }

  public static ArrayList<Integer> breadthFirstTree(BinaryTree<Integer> tree){
       ArrayList<Integer>list=new ArrayList<Integer>();
         Queue<Node> queue= new LinkedList<>();
        if (tree.getRoot()!=null){
            queue.add(tree.getRoot());
            while(!queue.isEmpty()){
              Node node = queue.remove();
              list.add((int)node.getData());
              if (node.getLeft()!= null){
                  queue.add(node.getLeft());
              }
                if (node.getRight()!= null){
                    queue.add(node.getRight());
                }
            }
        }
        return list ;
   }

    public static KaryTree<String> fizzBuzzTree(KaryTree<Integer> kTree){
        KaryTree<String> outSideTree = new KaryTree<>(kTree.K);
        Queue<KNode> queue = new LinkedList<>();
        if(!kTree.isEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){
                KNode<Integer> currNode = queue.poll();
                String currValue;
                if(currNode.data % 3 == 0 && currNode.data % 5 ==0 )
                    currValue = "FizzBuzz";
                else if((int)currNode.data % 3 == 0)
                    currValue="Fizz";
                else if((int)currNode.data % 5 == 0)
                    currValue="Buzz";
                else
                    currValue=currNode.data.toString();
                outSideTree.add(currValue);

                if(! currNode.children.isEmpty())
                    queue.addAll(currNode.children);
            }
        }
        return outSideTree;
    }

}
