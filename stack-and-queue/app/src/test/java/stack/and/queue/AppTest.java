/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void stackAndQueueTest(){
        //Can successfully push onto a stack:
          Stack <Integer> test = new Stack<>();

          test.push(2);
          assertEquals(2,test.top.value);

        //Can successfully push multiple values onto a stack:

            test.push(4);
            test.push(8);
            assertEquals(8,test.top.value);

        //Can successfully pop off the stack:

         assertEquals(8,test.pop());


        //Can successfully empty a stack after multiple pops:

              test.pop();
              test.pop();
              assertNull(test.top);

        //Can successfully peek the next item on the stack:

            test.push(2);
            assertEquals(2,test.peek());

        //Can successfully instantiate an empty stack:

            Stack <Integer> emptyTest =new Stack<>();
              assertNull(emptyTest.top);

        //Calling pop or peek on empty stack raises exception:

             emptyTest.peek();


        //Can successfully enqueue into a queue:


              Queue<Integer> queueTest =new Queue<>();
              queueTest.enqueue(7);
              assertEquals(7,queueTest.front.value);


        //Can successfully enqueue multiple values into a queue:

        queueTest.enqueue(7);
        queueTest.enqueue(9);
        assertEquals(9,queueTest.back.value);

        //Can successfully dequeue out of a queue the expected value:

        assertEquals(7,queueTest.dequeue());


        //Can successfully peek into a queue, seeing the expected value:

        queueTest.enqueue(2);
        assertEquals(2,test.peek());

        //Can successfully empty a queue after multiple dequeues:
             queueTest.dequeue();
             queueTest.dequeue();
             queueTest.dequeue();
             assertNull(queueTest.front);

        //Can successfully instantiate an empty queue:
           Queue<Integer> emptyTestQ =new Queue<>();
             assertNull(emptyTestQ.front);

        //Calling dequeue or peek on empty queue raises exception:
           emptyTestQ.dequeue();


        PseudoQueue<Integer> pseudoTest = new  PseudoQueue<>();



    }

    @Test void bracketTest(){

        String str = "{}";
        assertTrue(App.bracketsBalanced(str));


        String strr="{)";
        assertFalse(App.bracketsBalanced(strr));

    }

    @Test
    public void emptyAnimalShelterTest() {
        AnimalShelter testShelter = new AnimalShelter();
            Cat c1 =new Cat("cat");
            Dog d1 = new Dog("Dog 1");

            testShelter.enqueue(c1);
            testShelter.dequeue("Dog 1");
            String expected ="cat";

          System.out.println(expected);
          System.out.println(testShelter.enqueue(c1).getName());
          System.out.println(testShelter.dequeue("Dog 1"));


        assertEquals(expected,testShelter.enqueue(c1).getName());

        assertNull(null, String.valueOf(testShelter).toString());
    }


    @Test void stackQueuePsudo(){

        // testing that its enqueue properly
        PseudoQueue<Integer> test = new PseudoQueue<>();
        test.enQueue(5);
        assertEquals(5,test.stack1.peek());


        // testing that it dequeue properly
        assertEquals(5,test.deQueue());




}}

