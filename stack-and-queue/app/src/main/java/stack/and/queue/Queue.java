package stack.and.queue;

public class Queue <T>{
    Node <T> front;
    Node <T> back;


    public  void enqueue(T value){
        Node <T> node = new Node<>(value);
        if (front == null){
            front=node;
            back=front;
        }else {
            back.next=node;
            back=node;
        }
    }



     public T dequeue (){
        T data =null;
         if (front != null){
             data = front.value;
             front = front.next;
         }else {
             System.out.println("Error");
         }
         return data;
     }



    public T peek(){
        T data=front.value;
        try{
            return data;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }



    public  boolean isEmpty(){
        if (front==null){
            return true;

        }
        return false;
    }


}
