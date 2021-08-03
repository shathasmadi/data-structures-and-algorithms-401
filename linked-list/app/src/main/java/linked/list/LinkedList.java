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
        while (curr != null) {
            if (curr.value == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    public String toString() {
        String nodeString = "";
        Node curr = head;
        while (curr != null) {
            nodeString += "{ " + curr.value + " } -> ";
            curr = curr.next;
        }
        nodeString += "NULL";
        return nodeString;
    }


    //solve code challenge 6 : linked-list-insertions

    public void append(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;

        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

    }


    public void insertBefore(int value, int newValue) {

        Node newNode = new Node(newValue);
        Node curr = head;

        while (curr.next != null) {
            if (head.value == value) {
                insertNode(newValue);

            }
            if (curr.next.value == value) {
                newNode.next = curr.next;
                curr.next = newNode;
                break;
            }

            curr = curr.next;
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node curr = head;

        while (curr.next != null && curr.value != value) {
            curr = curr.next;

        }
        if (curr.value == value){
            newNode.next = curr.next;
            curr.next = newNode;

        }

    }
}










