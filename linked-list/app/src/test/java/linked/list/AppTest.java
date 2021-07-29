/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");



        //Can successfully instantiate an empty linked list

        LinkedList linkedTest = new LinkedList();
        assertNull(linkedTest.head);

        // Can properly insert into the linked list

        linkedTest.insertNode(5);
        assertEquals(5,linkedTest.head.value);

        //The head property will properly point to the first node in the linked list

        assertEquals(5,linkedTest.head.value);
        assertNull(linkedTest.head.next);

        // Can properly insert multiple nodes into the linked list
         linkedTest.insertNode(5);
         linkedTest.insertNode(2);

         assertEquals(2,linkedTest.head.value);

         //Will return true when finding a value within the linked list that exists

        linkedTest.insertNode(5);
        linkedTest.insertNode(2);
        assertTrue(linkedTest.includes(2));



        //Will return false when searching for a value in the linked list that does not exist
        linkedTest.insertNode(5);
        linkedTest.insertNode(2);
        assertFalse(linkedTest.includes(7));

//        System.out.print(linkedTest.toString());

        //Can properly return a collection of all the values that exist in the linked list
        linkedTest.insertNode(3);
        linkedTest.insertNode(4);
        assertEquals("{ 4 } -> { 3 } -> { 2 } -> { 5 } -> { 2 } -> { 5 } -> { 2 } -> { 5 } -> { 5 } -> NULL",linkedTest.toString());
    }
}
