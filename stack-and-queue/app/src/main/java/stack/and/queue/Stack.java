package stack.and.queue;

public class Stack <T> {
    public Node <T> top;



    public void push(T value){
          Node <T> node = new Node <T>(value);
          if(top == null){
              top=node;

          }else{
              node.next=top;
              top=node;
          }


    }

    public T pop(){
        T data =null;
        if(top != null){
            data=top.value;
            top=top.next;
        }else{
            System.out.println("error");
//            throw new NullPointerException();

        }

      return data;
    }


    public T peek(){
        T data=null;
    try{
        data=top.value;
      return data;
    }
    catch (Exception e){
       e.printStackTrace();
    }
    return  null;
   }


   public  boolean isEmpty(){
        if (top==null){
            return true;

        }
        return false;
   }


}
