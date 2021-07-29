package linked.list;

public class LinkedList {
    Node head;


    public void insertNode(int number) {
        Node newNode = new Node(number);
        if (head != null) {
            newNode.next = head;

        }
        head = newNode;
    }

    public boolean includes(int value) {

            Node curr = head;
            while(curr != null){
                if (curr.value == value){
                    return true;
                }
                curr=curr.next;
            }
        return false;
    }

    public  String toString(){
        String nodeString = "";
        Node curr = head;
        while (curr!= null) {
            nodeString += "{ " + curr.value + " } -> ";
            curr=curr.next;
        }
        nodeString+= "NULL";
        return nodeString;
    }



}





