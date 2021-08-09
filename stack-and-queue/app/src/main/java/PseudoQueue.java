import stack.and.queue.Stack;

public class PseudoQueue <T>{

    public  Stack<T> stack1 = new Stack<T>();
    public Stack<T> stack2 = new Stack<T>();


    public void enQueue(T value)
    {
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());

        }
        stack1.push(value);
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }

     public T deQueue()
    {
        if (stack1.isEmpty())
        {
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        T value = stack1.peek();
        stack1.pop();
        return value;
    }
}
