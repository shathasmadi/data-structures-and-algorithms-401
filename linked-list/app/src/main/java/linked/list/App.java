/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {
    public String getGreeting() {

        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        LinkedList list = new LinkedList();
        list.insertNode(7);
        list.insertNode(5);
        list.insertNode(3);
        list.insertNode(8);
        list.insertNode(1);
        list.insertNode(2);

        // code challenge 6 : linked-list-insertions

        //1-append
          list.append(4);


       //2-insertBefore
          list.insertBefore(2,5);


        //3-insertAfter
           list.insertAfter(8,4);


        System.out.println(list.includes(5));


        System.out.println(list.toString());
    }
}
